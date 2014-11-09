package org.java.test;

import com.objectsbydesign.calc.model.*;
import com.objectsbydesign.calc.view.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class OperandCommandTest {

    private OperandCommand operandCommand;

    @Before
    public void setUp() {
        operandCommand = new OperandCommand(null);
    }

    @Test
    public void executeTest0() {
        Cpu mockVar0;
        mockVar0 = EasyMock.createMock(Cpu.class);
        operandCommand.execute(mockVar0);
    }

    @Test
    public void displayTest1() {
        operandCommand.display();
    }
}
