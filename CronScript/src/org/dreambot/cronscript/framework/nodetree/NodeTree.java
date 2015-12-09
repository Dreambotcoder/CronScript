package org.dreambot.cronscript.framework.nodetree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Cath on 9/12/2015.
 */

public abstract class NodeTree extends Node implements Comparator<Node> {

    private List<Node> nodeList;


    public NodeTree() {
        nodeList = new ArrayList<>();
    }


    public Node[] getLeaves() {
        return nodeList.toArray(new Node[nodeList.size()]);
    }

    @Override
    public int compare(Node node1, Node node2) {
        return node1.priority() - node2.priority();
    }

    @Override
    public int onLoop() {
        return  nodeList.stream()
                .filter(Objects::nonNull)
                .filter(Node::onValid)
                .findFirst()
                .get()
                .onLoop();
    }

}
