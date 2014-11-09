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

public class DecimalValueTest {

    private DecimalValue decimalValue;

    @Before
    public void setUp() {
        decimalValue = new DecimalValue(1.0);
    }

    @Test
    public void createTest0() {
        decimalValue.create("test");
    }

    @Test
    public void addTest1() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        decimalValue.add(mockVar0);
    }

    @Test
    public void multiplyTest2() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        decimalValue.multiply(mockVar0);
    }

    @Test
    public void divideTest3() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        decimalValue.divide(mockVar0);
    }

    @Test
    public void squareRootTest4() {
        decimalValue.squareRoot();
    }

    @Test
    public void inverseTest5() {
        decimalValue.inverse();
    }

    @Test
    public void negateTest6() {
        decimalValue.negate();
    }

    @Test
    public void percentTest7() {
        decimalValue.percent();
    }

    @Test
    public void addDigitTest8() {
        decimalValue.addDigit("test", "test");
    }

    @Test
    public void toStringTest9() {
        decimalValue.toString();
    }
}
