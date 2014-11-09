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

public class EnteringNumberStateTest {

    private EnteringNumberState enteringNumberState;

    @Before
    public void setUp() {
        enteringNumberState = new EnteringNumberState(new Cpu());
    }

    @Test
    public void enterDigitTest0() {
        enteringNumberState.enterDigit("test");
    }

    @Test
    public void enterOperationTest1() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        enteringNumberState.enterOperation(mockVar0);
    }

    @Test
    public void enterValueTest2() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        enteringNumberState.enterValue(mockVar0);
    }
}
