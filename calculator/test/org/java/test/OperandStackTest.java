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

public class OperandStackTest {

    private OperandStack operandStack;

    @Before
    public void setUp() {
        operandStack = new OperandStack();
    }

    @Test
    public void popTest0() {
        operandStack.pop();
    }

    @Test
    public void pushTest1() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        operandStack.push(mockVar0);
    }

    @Test
    public void peekTest2() {
        operandStack.peek();
    }

    @Test
    public void emptyTest3() {
        operandStack.empty();
    }

    @Test
    public void clearTest4() {
        operandStack.clear();
    }
}
