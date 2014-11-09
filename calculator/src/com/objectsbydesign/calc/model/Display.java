/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.model;


/**
 * Display is responsible for receiving numerical input from the keyboard.
 */

public class Display extends Register {

    String number = "0";
    boolean decimalSet = false;
    static final int MAXLENGTH = 14;


    public Display ( Value value ) {
        super(value);
    }

    /**
     * Adds one digit to the display
     */
    public void addDigit(String digit) {

        // if greater than maximum digits, discard
        if (number.length() >= MAXLENGTH)
            return;

        // let the value do the work
        number = value.addDigit(number, digit);
        
        setChanged();
        notifyObservers(number);
    }

    public void setValue(Value value) {
        super.setValue(value);
        number = value.toString();
    }

    public Value createValue () {
        setValue(number);
        return getValue();
    }


    /**
     * Clears the display register
     */
    public void clear() {
        number = "0";
        decimalSet = false;

        // clear the register superclass
        super.clear();
    }


    /** 
     * Reset the display register
     */
    public void reset() {
        number = "0";
        decimalSet = false;

        // reset the register superclass
        super.reset();
    }
}
