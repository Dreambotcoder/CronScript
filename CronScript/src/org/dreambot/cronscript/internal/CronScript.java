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

    private NodeTree rootTree;
    private TreeController treeController;
    /**
     * Check for stuff/conditions for the script to start
     * @return True if allowed to start, false if conditions are not met (shutdown)
     */
    public abstract boolean onStartCondition();

    /**
     * Actions to do before going into script loop
     */
    public abstract void onStartActions();

    public void onStart() {
        if (onStartCondition()) {
            onStartActions();
        } else {
            stop();
        }
    }

    public TreeController getTreeController() {
        return treeController;
    }

}
