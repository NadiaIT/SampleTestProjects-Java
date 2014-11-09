/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */
package com.objectsbydesign.calc.model;


public class WaitingForInputState extends State {

    public WaitingForInputState(Cpu cpu) {
        super(cpu);
    }

    public State enterDigit(String digit) {

        // reset the CPU
        cpu.reset();

        // add the digit
        display.addDigit(digit);

        // next state
        return cpu.EnteringNumberState;
    }

    public State enterOperation(Operation op) {

        // if no operands yet, start with the display register
        if (cpu.getOperandStack().empty())
            cpu.pushDisplayRegister();

        // push the new operation onto the operation stack
        cpu.pushOperation(op);

        // no lookahead: go to WaitingForInput
        if (!op.getLookahead())
            return cpu.WaitingForInputState;

        // lookahead: go to WaitingForNumber
        else
            return cpu.WaitingForNumberState;
    }

    public State enterValue(Operation op) {

        // reset the CPU
        cpu.reset();

        // execute operation for entering value (e.g. memory recall)
        cpu.executeOperation(op);

        // push the current display value onto the operand stack
        cpu.pushDisplayRegister();

        // next state
        return this;
    }
}
