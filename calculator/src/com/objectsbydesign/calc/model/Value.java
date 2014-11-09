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
 * Interface for all value types
 */
public interface Value {
    public Value create (String string);
    public Value add (Value other);
    public Value subtract (Value other);
    public Value multiply (Value other);
    public Value divide (Value other);
    public Value negate ();
    public Value squareRoot ();
    public Value inverse ();
    public Value percent ();
    public String addDigit ( String number, String digit );
}
