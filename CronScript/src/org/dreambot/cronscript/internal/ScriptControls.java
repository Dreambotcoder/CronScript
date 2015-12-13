package org.dreambot.cronscript.internal;

import org.dreambot.cronscript.visual.PaintController;
import org.dreambot.cronscript.framework.nodetree.NodeTree;
import org.dreambot.cronscript.framework.nodetree.TreeController;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class ScriptControls {

    private PaintController paintController;
    private TreeController treeController;

    public ScriptControls(CronScript cs) {
        paintController = new PaintController(cs);
        NodeTree root = new NodeTree(0) {
            @Override
            public String getStatus() {
                return this.getCandidateLeaf().get().getStatus();
            }
            @Override
            public int priority() {
                return 1;
            }
            @Override
            public boolean onValid() {
                return true;
            }
        };
        treeController = new TreeController(root);
    }

    public PaintController getPaintController() {
        return paintController;
    }

    public TreeController getTreeController() {
        return treeController;
    }
}
