package com.dneelyep.utils;

import javax.swing.*;
import java.awt.*;

/** A series of useful utility methods to assist me when I use GridBagLayout. */
public class GridBagUtils {

    /** Add a given component to a container at the specified point, using the
     * given GridBagConstraints. */
    public static void addAtCoords(JComponent component, Point point, Container container, GridBagConstraints constraints) {
        constraints.gridx = point.x;
        constraints.gridy = point.y;
        container.add(component, constraints);
    }
}
