package org.dreambot.cronscript.awt;

import java.awt.*;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public enum ColourPalette {

    ROCKET_THEME(new Color(47,52,79), new Color(246,88,106), new Color(0,197,161), new Color(255,214,79)),
    YANGS_GLOVES(new Color(179,0,40), new Color(255,230,207), new Color(255,255,255), new Color(78,60,53));

    private ColourPalette(Color... colours) {
        this.colours = colours;
    }

    private Color[] colours;

    public Color[] getColours() {
        return colours;
    }
}
