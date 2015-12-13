package org.dreambot.cronscript.visual;

import org.dreambot.cronscript.internal.CronScript;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class PaintController {

    private ToolTip toolTip;
    private CronScript cs;


    public PaintController(CronScript cs) {
        this.cs = cs;
    }

    public void setToolTip(boolean on) {
        if (on) {
            toolTip = new ToolTip(cs);
        } else {
            toolTip = null;
        }
    }

    public boolean hasToolTip() {
        return toolTip != null;
    }

    public ToolTip getToolTip() {
        return toolTip;
    }


}
