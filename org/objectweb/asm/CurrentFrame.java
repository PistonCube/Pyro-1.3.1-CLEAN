// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm;

final class CurrentFrame extends Frame
{
    CurrentFrame(final Label owner) {
        super(owner);
    }
    
    @Override
    void execute(final int opcode, final int arg, final Symbol symbolArg, final SymbolTable symbolTable) {
        super.execute(opcode, arg, symbolArg, symbolTable);
        final Frame successor = new Frame(null);
        this.merge(symbolTable, successor, 0);
        this.copyFrom(successor);
    }
}
