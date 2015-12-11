package org.dreambot.cronscript.awt.components;

import org.dreambot.cronscript.awt.PaintComponent;

import java.awt.*;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class BackgroundBox implements PaintComponent<CronRectangle> {

    private int x;
    private int y;
    private Color c;
    private float transparency;

    public BackgroundBox() {

    }

    @Override
    public void onPaint(Graphics g) {
    }

    @Override
    public void setTransparency(float transparency) {
    }

    @Override
    public void setLocation(int x, int y) {
    }

    @Override
    public void setColor(Color color) {
    }

    @Override
    public CronRectangle get() {
        return null;
    }
}
