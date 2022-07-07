// 
// Decompiled by Procyon v0.5.36
// 

package com.mojang.brigadier.tree;

import com.mojang.brigadier.builder.ArgumentBuilder;
import java.util.Collections;
import java.util.Collection;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.RedirectModifier;
import java.util.function.Predicate;
import com.mojang.brigadier.Command;

public class LiteralCommandNode<S> extends CommandNode<S>
{
    private final String literal;
    
    public LiteralCommandNode(final String literal, final Command<S> command, final Predicate<S> requirement, final CommandNode<S> redirect, final RedirectModifier<S> modifier, final boolean forks) {
        super(command, requirement, redirect, modifier, forks);
        this.literal = literal;
    }
    
    public String getLiteral() {
        return this.literal;
    }
    
    @Override
    public String getName() {
        return this.literal;
    }
    
    @Override
    public void parse(final StringReader reader, final CommandContextBuilder<S> contextBuilder) throws CommandSyntaxException {
        final int start = reader.getCursor();
        final int end = this.parse(reader);
        if (end > -1) {
            contextBuilder.withNode(this, StringRange.between(start, end));
            return;
        }
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect().createWithContext(reader, this.literal);
    }
    
    private int parse(final StringReader reader) {
        final int start = reader.getCursor();
        if (reader.canRead(this.literal.length())) {
            final int end = start + this.literal.length();
            if (reader.getString().substring(start, end).equals(this.literal)) {
                reader.setCursor(end);
                if (!reader.canRead() || reader.peek() == ' ') {
                    return end;
                }
                reader.setCursor(start);
            }
        }
        return -1;
    }
    
    @Override
    public CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> context, final SuggestionsBuilder builder) {
        if (this.literal.toLowerCase().startsWith(builder.getRemaining().toLowerCase())) {
            return builder.suggest(this.literal).buildFuture();
        }
        return Suggestions.empty();
    }
    
    public boolean isValidInput(final String input) {
        return this.parse(new StringReader(input)) > -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LiteralCommandNode)) {
            return false;
        }
        final LiteralCommandNode that = (LiteralCommandNode)o;
        return this.literal.equals(that.literal) && super.equals(o);
    }
    
    @Override
    public String getUsageText() {
        return this.literal;
    }
    
    @Override
    public int hashCode() {
        int result = this.literal.hashCode();
        result = 31 * result + super.hashCode();
        return result;
    }
    
    @Override
    public LiteralArgumentBuilder<S> createBuilder() {
        final LiteralArgumentBuilder<S> builder = LiteralArgumentBuilder.literal(this.literal);
        builder.requires((Predicate<S>)this.getRequirement());
        builder.forward((CommandNode<S>)this.getRedirect(), (RedirectModifier<S>)this.getRedirectModifier(), this.isFork());
        if (this.getCommand() != null) {
            builder.executes((Command<S>)this.getCommand());
        }
        return builder;
    }
    
    @Override
    protected String getSortedKey() {
        return this.literal;
    }
    
    @Override
    public Collection<String> getExamples() {
        return Collections.singleton(this.literal);
    }
    
    @Override
    public String toString() {
        return "<literal " + this.literal + ">";
    }
}
