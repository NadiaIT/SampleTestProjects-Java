/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

/**
 * Panel to hold the function buttons
 */
package com.objectsbydesign.calc.view;

import java.awt.*;
import java.awt.event.ActionListener;

public class FunctionPanel extends KeyPanel {

    public FunctionPanel(Calculator calculator) {
        super(calculator);
        ActionListener handler = getOperationHandler();

        //GridLayout(rows, columns, hgap, vgap)
        setLayout(new GridLayout(2, 3, 5, 10));

        addKey("C", "Clear", handler);
        addKey("SQR", "Square", handler);
        addKey("SQRT", "SquareRoot", handler);
        addKey("1/X", "Inverse", handler);

        addKey("MR", "MemoryRecall", handler);
        addKey("MC", "MemoryClear", handler);
        addKey("M-", "MemoryMinus", handler);
        addKey("M+", "MemoryPlus", handler);
    }
}