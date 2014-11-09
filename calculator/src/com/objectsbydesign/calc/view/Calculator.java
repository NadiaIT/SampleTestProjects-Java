/**
    Object-Oriented Calculator

    Copyright (C) 1999-2002, Objects by Design, Inc. All Rights Reserved.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation. A copy of the license may be found at
    http://www.objectsbydesign.com/projects/gpl.txt
 */

package com.objectsbydesign.calc.view;

import com.objectsbydesign.calc.model.Cpu;

import java.util.*;

public class Calculator {

    // Executes the operations
    Cpu cpu;

    // Keeps a record of activity
    CalculatorTape tape;

    // Calculator frame
    CalculatorFrame frame;


    public Calculator() {
        cpu = new Cpu();
        tape = new CalculatorTape(cpu);
        frame = new CalculatorFrame(this);
    }

    public void enterOperation(String operation) {

        // input the operation to the CPU
        cpu.enterOperation(operation);
    }

    public void enterDigit(String digit) {

        // input the number to the CPU
        cpu.enterDigit(digit);
    }

    public void addDisplayObserver(Observer observer) {
        cpu.addDisplayObserver(observer);
    }

    public void addMemoryObserver(Observer observer) {
        cpu.addMemoryObserver(observer);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}


