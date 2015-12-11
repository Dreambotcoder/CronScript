package org.dreambot.cronscript.awt;



import java.awt.*;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class PaintController {

    private ColourPalette theme;

    public PaintController() {
        theme = ColourPalette.ROCKET_THEME;
    }

    public void setTheme(ColourPalette theme) {
        this.theme = theme;
    }

    public void onPaint(Graphics g) {
    }
}
