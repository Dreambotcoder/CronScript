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

    /**
     * Our root NodeTree component, where all other NodeTrees are built under
     */
    private NodeTree rootTree;

    /**
     * Controller within the root NodeTree
     */
    private TreeController treeController;

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

    /**
     * Check for stuff/conditions for the script to start
     * @return True if allowed to start, false if conditions are not met (shutdown)
     */
    public abstract boolean onStartCondition();

    /**
     * Actions to do before going into script loop
     */
    public abstract void onStartActions();

    /**
     * Onstart method
     */
    public void onStart() {
        if (onStartCondition()) {
            onStartActions();
        } else {
            stop();
        }
    }

    /**
     * Only should be using the controller in the main logic script class, thus protected modifier
     * @return
     */
    protected TreeController getTreeController() {
        return treeController;
    }

}
