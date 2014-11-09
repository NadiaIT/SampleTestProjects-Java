/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

/**
 * Panel containing the number keys and their ActionListeners
 */

package com.objectsbydesign.calc.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class NumberPanel extends KeyPanel {

    private DigitHandler digitHandler = new DigitHandler();
    private ActionListener operationHandler = getOperationHandler();

    public NumberPanel(Calculator calculator) {
        super(calculator);

        setLayout(new GridLayout(4, 3, 5, 5));

        addKey("7", "Seven", digitHandler);
        addKey("8", "Eight", digitHandler);
        addKey("9", "Nine", digitHandler);
        addKey("4", "Four", digitHandler);
        addKey("5", "Five", digitHandler);
        addKey("6", "Six", digitHandler);
        addKey("1", "One", digitHandler);
        addKey("2", "Two", digitHandler);
        addKey("3", "Three", digitHandler);
        addKey("0", "Zero", digitHandler);
        addKey(".", "Decimal", digitHandler);

        addKey("+/-", "ReverseSign", operationHandler);
    }

    /**
     * Inner class ActionListener
     */
    class DigitHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // get the String version of digit
            String action = event.getActionCommand();
            String digit = getKey(action);

            // dispatch digit to calculator
            calculator.enterDigit(digit);
        }
    }
}
