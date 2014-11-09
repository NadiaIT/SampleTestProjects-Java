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

public class OperationStack {

    Stack stack;

    public OperationStack() {
        stack = new Stack();
    }

    public void push(Operation operation) {
        stack.push(operation);
    }

    public Operation pop() {
        return (Operation) stack.pop();
    }

    public boolean empty() {
        return stack.empty();
    }

    public void clear() {
        stack = new Stack();
    }

    public Operation peek() {
        return (Operation) stack.peek();
    }

}