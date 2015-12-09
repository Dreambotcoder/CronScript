package org.dreambot.cronscript.internal;

import org.dreambot.api.script.AbstractScript;
import org.dreambot.cronscript.framework.nodetree.NodeTree;
import org.dreambot.cronscript.framework.nodetree.TreeController;


/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public abstract class CronScript extends AbstractScript {

    private NodeTree rootTree;
    private TreeController treeController;

    public abstract boolean onStartCondition();
    public abstract void onStartActions();

    public CronScript() {
        rootTree = new NodeTree(0) {
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
        treeController = new TreeController(rootTree);
    }

    public void onStart() {
        if (onStartCondition()) {
            onStartActions();
        } else {
            stop();
        }
    }

    protected TreeController getController() {
        return treeController;
    }

}
