package org.dreambot.cronscript.framework.nodetree;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public abstract class Node {

    public abstract String getStatus();

    public abstract int priority();

    public abstract boolean onValid();

    public abstract int onLoop();

}
