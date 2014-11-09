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
 * Superclass of all memory operation classes
 */

public abstract class MemoryOperation extends Operation {

    protected Memory memory;

    protected Display display;

    public MemoryOperation() {
        lookahead = false;
    }

    /**
     * Memory operations have an execute method just like all operations.
     * Prepare for execution method of the subclass.
     */
    public void execute(Cpu cpu) {

        // setup
        memory = cpu.getMemoryRegister();
        display = cpu.getDisplayRegister();
        stack = cpu.getOperandStack();

        // do the operation
        executeMemory();
    }

    public abstract void executeMemory();
}



