/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.model;

import java.util.Observable;

public class Register extends Observable {
    protected Value value;
    protected Value initialValue;

    public Register(Value value) {
        this.value = this.initialValue = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
        doNotify();
    }

    public void setValue(String value) {
        this.value = this.value.create(value);
        doNotify();
    }

    public void clear() {
        reset();
        doNotify();
    }

    public void reset() {
        value = initialValue;
    }

    protected void doNotify() {
        setChanged();
        notifyObservers(value.toString());
    }
}