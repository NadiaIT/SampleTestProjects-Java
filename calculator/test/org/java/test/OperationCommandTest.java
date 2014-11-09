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

public class OperationCommandTest {

    private OperationCommand operationCommand;

    @Before
    public void setUp() {
        operationCommand = new OperationCommand(null);
    }

    @Test
    public void executeTest0() {
        Cpu mockVar0;
        mockVar0 = EasyMock.createMock(Cpu.class);
        operationCommand.execute(mockVar0);
    }

    @Test
    public void displayTest1() {
        operationCommand.display();
    }
}
