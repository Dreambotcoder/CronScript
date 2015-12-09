package org.dreambot.cronscript.framework.nodetree;

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
        return root.getCandidateLeaf().get().onLoop();
    }

}
