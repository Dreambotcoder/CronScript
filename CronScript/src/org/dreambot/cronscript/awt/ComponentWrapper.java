package org.dreambot.cronscript.awt;

import java.awt.*;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public interface ComponentWrapper<T> {

    T setTransparency(float transparency);

    T setLocation(int x, int y);

    T setColor(Color color);

    Color getColor();

    Point getLocation();

    float getTransparency();

    T get();

}
