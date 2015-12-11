package org.dreambot.cronscript.awt;

import java.awt.*;
import java.util.List;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class PaintController {

    private ColourPalette theme;
    private List<ComponentWrapper> componentList;

    public PaintController() {
        theme = ColourPalette.ROCKET_THEME;
    }


    public void setTheme(ColourPalette theme) {
        this.theme = theme;
    }

    public void onPaint(Graphics g) {
    }
}
