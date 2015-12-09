package org.dreambot.cronscript.framework.nodetree;

/**
 * Created by Cath on 9/12/2015.
 */
public abstract class Node {

    public abstract String getStatus();

    public abstract int priority();

    public abstract boolean onValid();

    public abstract int onLoop();
}
