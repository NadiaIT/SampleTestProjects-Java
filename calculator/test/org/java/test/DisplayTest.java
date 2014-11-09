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

public class DisplayTest {

    private Display display;

    @Before
    public void setUp() {
        display = new Display(null);
    }

    @Test
    public void addDigitTest0() {
        display.addDigit("test");
    }

    @Test
    public void setValueTest1() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        display.setValue(mockVar0);
    }

    @Test
    public void createValueTest2() {
        display.createValue();
    }

    @Test
    public void clearTest3() {
        display.clear();
    }

    @Test
    public void resetTest4() {
        display.reset();
    }
}
