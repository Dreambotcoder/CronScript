package org.dreambot.cronscript.framework.nodetree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cath on 9/12/2015.
 */

public abstract class NodeTree extends Node {

    private List<Node> nodeList;


    public NodeTree() {
        nodeList = new ArrayList<>();
    }

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public int priority() {
        return 0;
    }

    @Override
    public boolean onValid() {
        return false;
    }

    @Override
    public int onLoop() {
        return 0;
    }
}
