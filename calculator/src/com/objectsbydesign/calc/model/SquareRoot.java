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
 * Operation sub-class that implements square roots
 */

public class SquareRoot extends UnaryOperation {
    public SquareRoot() {
        symbol = "SQRT";
    }

    public Value executeUnary(Value value) {
        return value.squareRoot();
    }
}