package org.dreambot.cronscript.awt.components;

import org.dreambot.cronscript.awt.ComponentWrapper;

import java.awt.*;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class BackgroundBox implements ComponentWrapper<CronRectangle> {

    private float transparency;
    private Point location;
    private Color color;

    @Override
    public CronRectangle setTransparency(float transparency) {
        this.transparency = transparency;
        return get();
    }

    @Override
    public CronRectangle setLocation(int x, int y) {
        this.location = new Point(x,y);
        return get();
    }

    @Override
    public CronRectangle setColor(Color color) {
        this.color = color;
        return get();
    }

    @Override
    public Color getColor() {
        return new Color(color.getRed() * (1/255f), color.getGreen() * (1/255f), color.getBlue() * (1/255f), transparency);
    }

    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public float getTransparency() {
        return transparency;
    }

    @Override
    public CronRectangle get() {
        return new CronRectangle();
    }
}
