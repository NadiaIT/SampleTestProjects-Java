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
 * Superclass for all calculator states
 */
public abstract class State {
    protected Cpu cpu;
    protected Display display;

    public State(Cpu cpu) {
        this.cpu = cpu;
        display = this.cpu.getDisplayRegister();
    }

    public abstract State enterDigit(String digit);

    public abstract State enterOperation(Operation op);

    public abstract State enterValue(Operation op);
}

