package org.dreambot.cronscript.framework.nodetree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public class Controller {

    private List<Node> nodeList;

    public Controller() {
        nodeList = new ArrayList<>();
    }

    public void invoke(Node... nodes) {
        nodeList.addAll(Arrays.stream(nodes)
                .filter(Objects::nonNull)
                .filter(node -> !nodeList.contains(node))
                .collect(Collectors.toList()));
    }


}
