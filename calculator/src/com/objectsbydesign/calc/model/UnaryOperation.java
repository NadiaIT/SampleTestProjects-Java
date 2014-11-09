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
 * Superclass of all unary operation classes
 */

public abstract class UnaryOperation extends Operation {

    public UnaryOperation() {
        precedence = HIGH;
        lookahead = false;
    }

    public void execute(Cpu cpu) {
        OperandStack stack = cpu.getOperandStack();

        // pop top operand, perform unary operation, push result
        stack.push(executeUnary(stack.pop()));
        cpu.setUpdateDisplay();
    }

    public abstract Value executeUnary(Value value);

}