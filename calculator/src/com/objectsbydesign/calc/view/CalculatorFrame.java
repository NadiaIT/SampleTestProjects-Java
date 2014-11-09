/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Parent frame of the calculator, it contains all of the other panels
 */
public class CalculatorFrame extends JFrame {
    int width = 375;
    int height = 300;

    // Panel that contains a text field for display
    DisplayPanel display;

    // Panel that contains the memory and function keys
    FunctionPanel function;

    // Panel that containts the + - / * = keys
    OperationPanel operation;

    // Panel that contains the number keys
    NumberPanel key;

    Calculator calculator;


    public CalculatorFrame(Calculator calculator) {
        super("Calculator");
        this.calculator = calculator;

        setSize(width, height);
        center();
        setBackground(Color.lightGray);

        GridBagLayout layout = new GridBagLayout();
        getContentPane().setLayout(layout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = constraints.weighty = 1.0;
        constraints.fill = constraints.BOTH;
        constraints.anchor = constraints.WEST;
        constraints.insets = new Insets(5, 5, 10, 10);

        display = new DisplayPanel();
        buildConstraints(constraints, 0, 1, 4, 1);
        layout.setConstraints(display, constraints);
        getContentPane().add(display);
        calculator.addDisplayObserver(display);
        calculator.addMemoryObserver(display.getMemoryStatus());

        function = new FunctionPanel(calculator);
        buildConstraints(constraints, 0, 2, 3, 2);
        layout.setConstraints(function, constraints);
        getContentPane().add(function);

        operation = new OperationPanel(calculator);
        buildConstraints(constraints, 3, 2, 1, 6);
        layout.setConstraints(operation, constraints);
        getContentPane().add(operation);

        key = new NumberPanel(calculator);
        buildConstraints(constraints, 0, 4, 3, 4);
        layout.setConstraints(key, constraints);
        getContentPane().add(key);

        // Window Closing
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        addKeyListener(new KeyHandler());
        show();
        requestFocus();

    }

    void center() {
        Toolkit toolKit = this.getToolkit();
        Dimension screenSize = toolKit.getScreenSize();
        setLocation((screenSize.width - width) / 3, (screenSize.height - height) / 3);
    }

    protected void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            dispose();
            System.exit(0);
        }
        if ((e.getID() == WindowEvent.WINDOW_ACTIVATED) ||
                (e.getID() == WindowEvent.WINDOW_DEICONIFIED)) {
            requestFocus();
        }
    }

    private void buildConstraints(GridBagConstraints gbc, int gx, int gy, int gw, int gh) {
        gbc.gridx = gx;
        gbc.gridy = gy;
        gbc.gridwidth = gw;
        gbc.gridheight = gh;
    }

    /**
     * This inner class is a keyboard listener that implements all of the controls from the keyboard
     */
    class KeyHandler extends KeyAdapter {
        public void keyTyped(KeyEvent e) {
            char key = e.getKeyChar();
            switch (key) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                case '.':
                    String digit = (new Character(key)).toString();
                    calculator.enterDigit(digit);
                    break;


                case 'c':
                    calculator.enterOperation("Clear");
                    break;

                case '/':
                    calculator.enterOperation("Divide");
                    break;

                case '*':
                    calculator.enterOperation("Multiply");
                    break;

                case '-':
                    calculator.enterOperation("Minus");
                    break;

                case '+':
                    calculator.enterOperation("Plus");
                    break;

                case '=':
                    calculator.enterOperation("Equals");
                    break;

            }
        }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
                calculator.enterOperation("Equals");
        }
    }
}