// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.EnumDifficulty;

public class fb6
{
    public static int[] c;
    
    static {
        fb6.c = new int[EnumDifficulty.values().length];
        try {
            final int[] c = fb6.c;
            final EnumDifficulty peaceful = EnumDifficulty.PEACEFUL;
            while (true) {
                int n = 0;
                Label_0028: {
                    if (fc.1 != 0) {
                        n = 213326754;
                        break Label_0028;
                    }
                    n = 655430353;
                }
                switch (n ^ 0x137B4E59) {
                    case 533485051: {
                        continue;
                    }
                    case 879385736: {
                        c[peaceful.ordinal()] = 1;
                        break;
                    }
                    default: {
                        throw null;
                    }
                }
                break;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            while (true) {
                int n2 = 0;
                Label_0077: {
                    if (fc.0 != 0) {
                        n2 = -1268741405;
                        break Label_0077;
                    }
                    n2 = 1449914534;
                }
                switch (n2 ^ 0x685B28D4) {
                    case 426767501: {
                        continue;
                    }
                    case -600071625: {
                        throw null;
                    }
                }
                break;
            }
        }
        try {
            fb6.c[EnumDifficulty.EASY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            final int[] c2 = fb6.c;
            final EnumDifficulty hard = EnumDifficulty.HARD;
            while (true) {
                int n3 = 0;
                Label_0143: {
                    if (fc.c < 0) {
                        n3 = 702058758;
                        break Label_0143;
                    }
                    n3 = -1920310361;
                }
                switch (n3 ^ 0xA6BE6838) {
                    case 619157967: {
                        continue;
                    }
                    default: {
                        c2[hard.ordinal()] = 3;
                        break;
                    }
                    case -1889076930: {
                        throw null;
                    }
                }
                break;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
    }
}
