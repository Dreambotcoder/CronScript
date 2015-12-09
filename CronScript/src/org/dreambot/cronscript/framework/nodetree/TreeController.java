package org.dreambot.cronscript.framework.nodetree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public class TreeController implements Comparator<NodeTree> {

    private List<NodeTree> nodeList;

    public TreeController() {
        nodeList = new ArrayList<>();
    }

    public void invokeTree(NodeTree... tree) {
        nodeList.addAll(Arrays.stream(tree)
                .filter(Objects::nonNull)
                .filter(node -> !nodeList.contains(node))
                .collect(Collectors.toList()));
        nodeList.sort(this);
    }

    public void revokeTree(NodeTree... tree) {
        nodeList.removeAll(Arrays.stream(tree)
                .filter(Objects::nonNull)
                .filter(node -> nodeList.contains(node))
                .collect(Collectors.toList()));
        nodeList.sort(this);
    }

    public NodeTree findValidNodeTree() {
        return nodeList.stream().filter(Objects::nonNull).filter(Node::onValid).findFirst().get();
    }

    @Override
    public int compare(NodeTree tree1, NodeTree tree2) {
        return tree1.priority() - tree2.priority();
    }
}
