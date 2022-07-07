// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.util.font;

import net.minecraft.client.resources.IResourceManager;
import dev.nuker.pyro.fbs;
import net.minecraft.client.renderer.GlStateManager;
import java.awt.Color;
import org.lwjgl.opengl.GL20;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.fbE;
import dev.nuker.pyro.api.FontManager$CustomFontConfig;
import java.awt.Font;
import net.minecraft.client.gui.FontRenderer;

public class GameFontRenderer extends FontRenderer
{
    private Font font;
    private FontManager$CustomFontConfig config;
    private fbE defaultFont;
    private fbE boldFont;
    private fbE italicFont;
    private fbE boldItalicFont;
    
    public GameFontRenderer(final Font font, final FontManager$CustomFontConfig config) {
        super(Minecraft.func_71410_x().field_71474_y, new ResourceLocation("textures/font/ascii.png"), Minecraft.func_71410_x().func_110434_K(), false);
        this.font = font;
        this.config = config;
        this.defaultFont = new fbE(font);
        this.boldFont = new fbE(font.deriveFont(1));
        this.italicFont = new fbE(font.deriveFont(2));
        this.boldItalicFont = new fbE(font.deriveFont(3));
        this.field_78288_b = this.getHeight();
    }
    
    public int getHeight() {
        return this.defaultFont.0() / 2 + this.config.insets.yBegin + this.config.insets.yEnd;
    }
    
    public int getSize() {
        return this.defaultFont.1().getSize();
    }
    
    public void drawString(final String s, final float x, final float y, final int color) {
        this.func_175065_a(s, x, y, color, false);
    }
    
    public int func_175063_a(final String text, final float x, final float y, final int color) {
        return this.func_175065_a(text, x, y, color, true);
    }
    
    public void drawCenteredString(final String s, final float x, final float y, final int color, final boolean shadow) {
        this.func_175065_a(s, x - this.func_78256_a(s) / 2.0f, y, color, shadow);
    }
    
    public void drawCenteredString(final String s, final float x, final float y, final int color) {
        this.drawString(s, x - this.func_78256_a(s) / 2.0f, y, color);
    }
    
    public int func_175065_a(final String text, float x, float y, final int color, final boolean dropShadow) {
        x += this.config.insets.xBegin;
        y += this.config.insets.yBegin;
        final float currY = y - 3.0f;
        if (text.contains("\n")) {
            final String[] parts = text.split("\n");
            float newY = 0.0f;
            for (final String s : parts) {
                this.drawText(s, x, currY + newY, color, dropShadow);
                newY += this.getHeight();
            }
            return 0;
        }
        if (dropShadow) {
            GL20.glUseProgram(0);
            this.drawText(text, x + 0.5f, currY + 0.5f, new Color(0, 0, 0, 150).getRGB(), true);
        }
        return this.drawText(text, x, currY, color, false);
    }
    
    private int drawText(final String text, final float x, final float y, final int color, final boolean ignoreColor) {
        if (text == null) {
            return 0;
        }
        if (text.isEmpty()) {
            return (int)x;
        }
        GlStateManager.func_179137_b(x - 1.5, y + 0.5, 0.0);
        GlStateManager.func_179141_d();
        GlStateManager.func_179147_l();
        GlStateManager.func_179120_a(770, 771, 1, 0);
        GlStateManager.func_179098_w();
        int currentColor = color;
        if ((currentColor & 0xFC000000) == 0x0) {
            currentColor |= 0xFF000000;
        }
        final int alpha = currentColor >> 24 & 0xFF;
        if (text.contains("§")) {
            final String[] parts = text.split("§");
            fbE currentFont = this.defaultFont;
            double width = 0.0;
            boolean randomCase = false;
            boolean bold = false;
            boolean italic = false;
            boolean strikeThrough = false;
            boolean underline = false;
            for (int index = 0; index < parts.length; ++index) {
                final String part = parts[index];
                if (!part.isEmpty()) {
                    if (index == 0) {
                        currentFont.c(part, width, 0.0, currentColor);
                        width += currentFont.c(part);
                    }
                    else {
                        final String words = part.substring(1);
                        final char type = part.charAt(0);
                        final int colorIndex = "0123456789abcdefklmnor".indexOf(type);
                        switch (colorIndex) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15: {
                                if (!ignoreColor) {
                                    currentColor = (GameFontRenderer$ColorUtils.hexColors[colorIndex] | alpha << 24);
                                }
                                bold = false;
                                italic = false;
                                randomCase = false;
                                underline = false;
                                strikeThrough = false;
                                break;
                            }
                            case 16: {
                                randomCase = true;
                                break;
                            }
                            case 17: {
                                bold = true;
                                break;
                            }
                            case 18: {
                                strikeThrough = true;
                                break;
                            }
                            case 19: {
                                underline = true;
                                break;
                            }
                            case 20: {
                                italic = true;
                                break;
                            }
                            case 21: {
                                currentColor = color;
                                if ((currentColor & 0xFC000000) == 0x0) {
                                    currentColor |= 0xFF000000;
                                }
                                bold = false;
                                italic = false;
                                randomCase = false;
                                underline = false;
                                strikeThrough = false;
                                break;
                            }
                        }
                        if (bold && italic) {
                            currentFont = this.boldItalicFont;
                        }
                        else if (bold) {
                            currentFont = this.boldFont;
                        }
                        else if (italic) {
                            currentFont = this.italicFont;
                        }
                        else {
                            currentFont = this.defaultFont;
                        }
                        if (randomCase) {
                            currentFont.c(GameFontRenderer$ColorUtils.randomMagicText(words), width, 0.0, currentColor);
                        }
                        else {
                            currentFont.c(words, width, 0.0, currentColor);
                        }
                        if (strikeThrough) {
                            fbs.c(width / 2.0 + 1.0, currentFont.0() / 3.0, (width + currentFont.c(words)) / 2.0 + 1.0, currentFont.0() / 3.0, this.field_78288_b / 16.0f);
                        }
                        if (underline) {
                            fbs.c(width / 2.0 + 1.0, currentFont.0() / 2.0, (width + currentFont.c(words)) / 2.0 + 1.0, currentFont.0() / 2.0, this.field_78288_b / 16.0f);
                        }
                        width += currentFont.c(words);
                    }
                }
            }
        }
        else {
            this.defaultFont.c(text, 0.0, 0.0, currentColor);
        }
        GlStateManager.func_179084_k();
        GlStateManager.func_179137_b(-(x - 1.5), -(y + 0.5), 0.0);
        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
        return (int)(x + this.func_78256_a(text));
    }
    
    public int func_175064_b(final char charCode) {
        return GameFontRenderer$ColorUtils.hexColors[getColorIndex(charCode)];
    }
    
    public int func_78256_a(final String text) {
        final String currentText = text;
        if (text.contains("§")) {
            final String[] parts = text.split("§");
            fbE currentFont = this.defaultFont;
            int width = 0;
            boolean bold = false;
            boolean italic = false;
            for (int index = 0; index < parts.length; ++index) {
                final String part = parts[index];
                if (!part.isEmpty()) {
                    if (index == 0) {
                        width += currentFont.c(part);
                    }
                    else {
                        final String words = part.substring(1);
                        final char type = part.charAt(0);
                        final int colorIndex = getColorIndex(type);
                        if (colorIndex < 16) {
                            bold = false;
                            italic = false;
                        }
                        else if (colorIndex == 17) {
                            bold = true;
                        }
                        else if (colorIndex == 20) {
                            italic = true;
                        }
                        else if (colorIndex == 21) {
                            bold = false;
                            italic = false;
                        }
                        if (bold && italic) {
                            currentFont = this.boldItalicFont;
                        }
                        else if (bold) {
                            currentFont = this.boldFont;
                        }
                        else if (italic) {
                            currentFont = this.italicFont;
                        }
                        else {
                            currentFont = this.defaultFont;
                        }
                        width += currentFont.c(words) + this.config.insets.xBegin + this.config.insets.xEnd;
                    }
                }
            }
            return width / 2;
        }
        return this.defaultFont.c(currentText) / 2 + this.config.insets.xBegin + this.config.insets.xEnd;
    }
    
    public int func_78263_a(final char character) {
        return this.func_78256_a(String.valueOf(character));
    }
    
    public void func_110549_a(final IResourceManager resourceManager) {
    }
    
    protected void bindTexture(final ResourceLocation location) {
    }
    
    public static int getColorIndex(final char type) {
        switch (type) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': {
                return type - '0';
            }
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f': {
                return type - 'a' + 10;
            }
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o': {
                return type - 'k' + 16;
            }
            case 'r': {
                return 21;
            }
            default: {
                return -1;
            }
        }
    }
}
