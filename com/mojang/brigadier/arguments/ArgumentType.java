// 
// Decompiled by Procyon v0.5.36
// 

package com.mojang.brigadier.arguments;

import java.util.Collections;
import java.util.Collection;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public interface ArgumentType<T>
{
    T parse(final StringReader p0) throws CommandSyntaxException;
    
    default <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> context, final SuggestionsBuilder builder) {
        return Suggestions.empty();
    }
    
    default Collection<String> getExamples() {
        return (Collection<String>)Collections.emptyList();
    }
}
