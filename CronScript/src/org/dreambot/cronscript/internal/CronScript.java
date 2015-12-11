package org.dreambot.cronscript.internal;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.cronscript.awt.PaintController;
import org.dreambot.cronscript.framework.nodetree.NodeTree;
import org.dreambot.cronscript.framework.nodetree.TreeController;


/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public abstract class CronScript extends AbstractScript {

    private TreeController treeController;
    private PaintController paintController;

    public abstract boolean onStartCondition();
    public abstract void onStartActions();

    public CronScript() {
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

    public void onStart() {
        if (onStartCondition()) {
            onStartActions();
        } else {
            stop();
        }
    }

    protected TreeController getTreeController() {
        return treeController;
    }

    protected PaintController getPaintController() {
        return paintController;
    }

}
