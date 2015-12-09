package org.dreambot.cronscript.internal;

/**
 * Created by Yasin on 09/12/2015.
 */
public class Faggot {

    private String name;
    private boolean penis;
    private double penisSize;
    private int balls;


    public Faggot() {

    }

    public void checkForArno() {
        if(name.equalsIgnoreCase("arno")) {
            penis = false;
            balls = -1;
        }
        if(name.equalsIgnoreCase("steroidz arno")) {
            penis = true;
            balls = 2;
            penisSize = 1.9;

        }
    }

}
