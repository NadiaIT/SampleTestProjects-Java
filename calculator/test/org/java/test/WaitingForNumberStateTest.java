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

public class WaitingForNumberStateTest {

    private WaitingForNumberState waitingForNumberState;

    @Before
    public void setUp() {
        waitingForNumberState = new WaitingForNumberState(new Cpu());
    }

    @Test
    public void enterDigitTest0() {
        waitingForNumberState.enterDigit("test");
    }

    @Test
    public void enterOperationTest1() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        waitingForNumberState.enterOperation(mockVar0);
    }

    @Test
    public void enterValueTest2() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        waitingForNumberState.enterValue(mockVar0);
    }
}
