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
 * Superclass of all binary operation classes
 */

public abstract class BinaryOperation extends Operation {

    public BinaryOperation() {
        lookahead = true;
    }

    public void execute(Cpu cpu) {
        this.cpu = cpu;
        this.stack = cpu.getOperandStack();
        Value value1, value2;
        value2 = stack.pop();
        value1 = stack.pop();
        stack.push(executeBinary(value1, value2));
        cpu.setUpdateDisplay();
    }

    public abstract Value executeBinary(Value value1, Value value2);
}