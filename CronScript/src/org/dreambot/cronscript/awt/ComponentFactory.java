package org.dreambot.cronscript.awt;

import java.util.List;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public interface ComponentFactory<T extends PaintComponent> {

    void setTheme(ColourPalette theme);

    void create(T... component);

    List<T> components();

    T[] get();

}
