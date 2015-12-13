package org.dreambot.cronscript;

import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.cronscript.internal.CronScript;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        12/12/2015
 */
@ScriptManifest(category = Category.AGILITY, name = "CronFighter", author = "Articron", version = 0.02D)
public class TestScript extends CronScript {

    @Override
    public boolean onStartCondition() {
        getControls().getPaintController().setToolTip(true);
        return true;
    }

    @Override
    public void onStartActions() {

    }

    @Override
    public int onLoop() {
        return 0;
    }

}
