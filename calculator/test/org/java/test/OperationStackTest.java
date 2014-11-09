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

public class OperationStackTest {

    private OperationStack operationStack;

    @Before
    public void setUp() {
        operationStack = new OperationStack();
    }

    @Test
    public void pushTest0() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        operationStack.push(mockVar0);
    }

    @Test
    public void popTest1() {
        operationStack.pop();
    }

    @Test
    public void emptyTest2() {
        operationStack.empty();
    }

    @Test
    public void clearTest3() {
        operationStack.clear();
    }

    @Test
    public void peekTest4() {
        operationStack.peek();
    }
}
