/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.model;


public class WaitingForNumberState extends State {

    public WaitingForNumberState(Cpu cpu) {
        super(cpu);
    }

    public State enterDigit(String digit) {

        // reset the display register for new number
        display.reset();

        // add the new digit
        display.addDigit(digit);

        return cpu.EnteringNumberState;
    }

    public State enterOperation(Operation op) {
        // if there is a current operation, replace it
        cpu.replaceOperation(op);

        // stay in this state
        return this;
    }

    public State enterValue(Operation op) {

        // execute operation for entering value (e.g. memory recall)
        cpu.executeOperation(op);

        // next state
        return cpu.WaitingForOperationState;
    }
}
