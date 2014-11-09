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
 * Operation sub-class that implements the percent operation
 */

public class Percent extends Operation {

    public Percent() {
        precedence = HIGH;
        lookahead = false;
        symbol = "%";
    }

    public void execute(Cpu cpu) {
        OperandStack stack = cpu.getOperandStack();

        Value percent = stack.pop();
        percent = percent.percent();

        Value value = stack.peek();
        if (value != null) {
            value = value.multiply(percent);
            stack.push(value);
        }
        else
            stack.push(percent);

        cpu.setUpdateDisplay();
    }
}
