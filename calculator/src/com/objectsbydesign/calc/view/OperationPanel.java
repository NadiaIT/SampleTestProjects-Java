/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.view;

/**
 * Panel that holds the function buttons.
 */

import java.awt.*;
import java.awt.event.ActionListener;

public class OperationPanel extends KeyPanel {

    public OperationPanel(Calculator calculator) {
        super(calculator);
        ActionListener handler = getOperationHandler();

        // GridLayout(int rows, columns, hgap, vgap)
        setLayout(new GridLayout(6, 1, 5, 7));

        addKey("%", "Percent", handler);
        addKey("/", "Divide", handler);
        addKey("*", "Multiply", handler);
        addKey("-", "Minus", handler);
        addKey("+", "Plus", handler);
        addKey("=", "Equals", handler);
    }
}