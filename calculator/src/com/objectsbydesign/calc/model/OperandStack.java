/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.model;

import java.util.*;

/**
 * Operand stack on which the operations execute
 */

public class OperandStack {

    private Stack stack;

    public OperandStack() {
        stack = new Stack();
    }

    public Value pop() {
        return (Value) stack.pop();
    }

    public void push(Value value) {
        stack.push(value);
    }

    public Value peek() {
        return (Value) stack.peek();
    }

    public boolean empty() {
        return stack.empty();
    }

    public void clear() {
        stack = new Stack();
    }
}