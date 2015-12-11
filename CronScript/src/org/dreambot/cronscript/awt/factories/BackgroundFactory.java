package org.dreambot.cronscript.awt.factories;

import org.dreambot.cronscript.awt.ColourPalette;
import org.dreambot.cronscript.awt.ComponentFactory;
import org.dreambot.cronscript.awt.components.BackgroundBox;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Project:     Dreambot
 * Author:      Articron
 * Date:        11/12/2015
 */
public class BackgroundFactory implements ComponentFactory<BackgroundBox> {

    private ColourPalette theme;
    private List<BackgroundBox> components;

    @Override
    public void setTheme(ColourPalette theme) {
        this.theme = theme;
    }

    @Override
    public void create(BackgroundBox... component) {
        components.addAll(Arrays.stream(component)
                .filter(Objects::nonNull)
                .filter(c -> !components.contains(c))
                .collect(Collectors.toList()));
    }

    @Override
    public List<BackgroundBox> components() {
        return components;
    }

    @Override
    public BackgroundBox[] get() {
        return components.toArray(new BackgroundBox[components.size()]);
    }
}
