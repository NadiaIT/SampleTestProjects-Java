/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.model;

public class Memory extends Register {
    private static final String MEM_SET = "M";
    private static final String MEM_CLEAR = " ";

    private String status;

    public Memory ( Value value ) {
        super(value);
        status = MEM_CLEAR;
    }

    public void setValue(Value value) {
        status = MEM_SET;

        // set the register superclass
        super.setValue(value);
    }
    /**
     * Clears the display register
     */
    public void clear() {
        status = MEM_CLEAR;

        // clear the register superclass
        super.clear();
    }

    protected void doNotify() {
        setChanged();
        notifyObservers(status);
    }
}
