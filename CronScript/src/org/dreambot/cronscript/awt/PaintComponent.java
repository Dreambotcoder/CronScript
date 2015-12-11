package org.dreambot.cronscript.awt;

import java.awt.*;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public interface PaintComponent<T> {

    void onPaint(Graphics g);

    void setTransparency(float transparency);

    void setLocation(int x, int y);

    void setColor(Color color);

    T get();

}
