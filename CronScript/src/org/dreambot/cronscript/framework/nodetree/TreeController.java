package org.dreambot.cronscript.framework.nodetree;

import java.util.Arrays;
import java.util.Objects;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public class TreeController  {

    private NodeTree root;

    public TreeController(NodeTree root) {
        this.root = root;
    }

    public void invokeTree(NodeTree... tree) {
        root.addLeaves(tree);
    }

    public void revokeTree(NodeTree... tree) {
        root.removeLeaves(tree);
    }

    public int onLoop() {
        return root.onLoop();
    }

    public NodeTree[] getTrees() {
        return (NodeTree[]) Arrays.stream(root.getLeaves()).filter(Objects::nonNull).filter(node -> node.isTree).toArray();
    }

}