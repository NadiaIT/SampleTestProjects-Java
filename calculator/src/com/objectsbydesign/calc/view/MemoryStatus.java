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

public class MemoryStatus extends JTextField implements Observer {
    private JTextField memoryField;

    public MemoryStatus() {
        super("", 1);

        Font font = new Font("Helvetica", Font.BOLD|Font.ITALIC, 14);
        Border emptyBorder = BorderFactory.createEmptyBorder();

        setFont(font);
        setEditable(false);
        setBackground(Color.lightGray);
        setBorder(emptyBorder);
    }

    public void update(Observable observable, Object object) {
        setText((String) object);
    }
}
