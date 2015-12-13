package org.dreambot.cronscript.internal;

import org.dreambot.api.script.AbstractScript;

import java.awt.*;


/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        9/12/2015
 */
public abstract class CronScript extends AbstractScript {

    private ScriptControls scriptControls;

    public abstract boolean onStartCondition();
    public abstract void onStartActions();

    public CronScript() {
        scriptControls = new ScriptControls(this);
    }

    public void onStart() {
        if (onStartCondition()) {
            getClient().getInstance().setDrawMouse(false);
            onStartActions();
        } else {
            stop();
        }
    }

    public void onPaint(Graphics g) {
        if (scriptControls.getPaintController().hasToolTip()) {
            scriptControls.getPaintController().getToolTip().onPaint(g);
        }
    }

   protected ScriptControls getControls() {
       return scriptControls;
   }

}
