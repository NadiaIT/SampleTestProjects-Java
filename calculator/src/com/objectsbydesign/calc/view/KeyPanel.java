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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class KeyPanel extends JPanel  {

    protected Calculator calculator;
    protected OperationHandler operationHandler;
    protected HashMap keyMap;

    public KeyPanel(Calculator calculator) {
        this.calculator = calculator;
        operationHandler = new OperationHandler();
        keyMap = new HashMap();
    }

    protected void addKey(String display, String action, ActionListener handler) {
        JButton button = new JButton(display);
        button.setActionCommand(action);
        button.addActionListener(handler);
        add(button);
        keyMap.put(action, display);
    }

    protected String getKey(String action) {
        return (String)keyMap.get(action);
    }

    public OperationHandler getOperationHandler() {
        return operationHandler;
    }

    /**
     * Inner class ActionListener
     */
    class OperationHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            calculator.enterOperation(event.getActionCommand());
        }
    }
}
