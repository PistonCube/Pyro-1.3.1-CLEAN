// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import java.util.Collection;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import java.util.List;

public class LookupSwitchInsnNode extends AbstractInsnNode
{
    public LabelNode dflt;
    public List<Integer> keys;
    public List<LabelNode> labels;
    
    public LookupSwitchInsnNode(final LabelNode dflt, final int[] keys, final LabelNode[] labels) {
        super(171);
        this.dflt = dflt;
        this.keys = Util.asArrayList(keys);
        this.labels = Util.asArrayList(labels);
    }
    
    @Override
    public int getType() {
        return 12;
    }
    
    @Override
    public void accept(final MethodVisitor methodVisitor) {
        final int[] keysArray = new int[this.keys.size()];
        for (int i = 0, n = keysArray.length; i < n; ++i) {
            keysArray[i] = this.keys.get(i);
        }
        final Label[] labelsArray = new Label[this.labels.size()];
        for (int j = 0, n2 = labelsArray.length; j < n2; ++j) {
            labelsArray[j] = this.labels.get(j).getLabel();
        }
        methodVisitor.visitLookupSwitchInsn(this.dflt.getLabel(), keysArray, labelsArray);
        this.acceptAnnotations(methodVisitor);
    }
    
    @Override
    public AbstractInsnNode clone(final Map<LabelNode, LabelNode> clonedLabels) {
        final LookupSwitchInsnNode clone = new LookupSwitchInsnNode(AbstractInsnNode.clone(this.dflt, clonedLabels), null, AbstractInsnNode.clone(this.labels, clonedLabels));
        clone.keys.addAll(this.keys);
        return clone.cloneAnnotations(this);
    }
}
