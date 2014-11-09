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
 * Superclass for all of the operation subclasses
 */

public abstract class Operation {

    /* The precedence for operations.
     * For example, unary operations have a higher precedence than binary operations.
     */
    static final int HIGHEST = 5;
    static final int HIGH = 4;
    static final int MEDIUM = 3;
    static final int LOW = 2;
    static final int LOWEST = 1;

    protected int precedence;
    protected boolean lookahead;
    protected String symbol;
    protected Cpu cpu;
    protected OperandStack stack;

    public int getPrecedence() {
        return precedence;
    }

    public boolean getLookahead() {
        return lookahead;
    }

    public String toString() {
        return symbol;
    }

    public void setString(String s) {
        symbol = s;
    }


    /**
     * The execute method signature which must be implemented for each operation.
     */
    public abstract void execute(Cpu cpu);

}



