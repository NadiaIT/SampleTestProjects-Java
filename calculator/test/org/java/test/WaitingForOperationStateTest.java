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

public class WaitingForOperationStateTest {

    private WaitingForOperationState waitingForOperationState;

    @Before
    public void setUp() {
        waitingForOperationState = new WaitingForOperationState(new Cpu());
    }

    @Test
    public void enterDigitTest0() {
        waitingForOperationState.enterDigit("test");
    }

    @Test
    public void enterOperationTest1() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        waitingForOperationState.enterOperation(mockVar0);
    }

    @Test
    public void enterValueTest2() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        waitingForOperationState.enterValue(mockVar0);
    }
}
