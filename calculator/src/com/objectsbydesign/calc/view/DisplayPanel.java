/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Class to display the entries and the results of the calcuator.
 */

public class DisplayPanel extends JPanel implements Observer {

    private JTextField displayField;
    private MemoryStatus memoryStatus;

    private static final int MAXDIGITS = 16;


    public DisplayPanel() {
        this.setBackground(Color.lightGray);

        memoryStatus = new MemoryStatus();
        add(memoryStatus);

        Font font = new Font("Monospaced", Font.BOLD, 18);
        Border bevelBorder = BorderFactory.createLoweredBevelBorder();

        displayField = new JTextField("0", MAXDIGITS);
        displayField.setFont(font);
        displayField.setEditable(false);
        displayField.setBackground(Color.white);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setBorder(bevelBorder);

        add(displayField);
    }

    public MemoryStatus getMemoryStatus ( ) {
        return memoryStatus;
    }

    public void setDisplay(String text) {
        displayField.setText(text);
    }

    public void update(Observable observable, Object object) {
        setDisplay((String) object);
    }
}