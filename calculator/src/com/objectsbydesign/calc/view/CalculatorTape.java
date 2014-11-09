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
import com.objectsbydesign.calc.model.Command;

import java.util.*;

public class CalculatorTape implements Observer {
    LinkedList commands;

    public CalculatorTape(Cpu cpu) {
        cpu.addObserver(this);
        commands = new LinkedList();
    }


    /**
     * The command list is observing the cpu and recording the commands as
     * they are executed by the cpu.
     */
    public void update(Observable cpu, Object cmd) {
        Command command = (Command) cmd;
        command.display();
        commands.add(command);
    }
}
