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

public class SquareRootTest {

    private SquareRoot squareRoot;

    @Before
    public void setUp() {
        squareRoot = new SquareRoot();
    }

    @Test
    public void executeUnaryTest0() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        squareRoot.executeUnary(mockVar0);
    }
}
