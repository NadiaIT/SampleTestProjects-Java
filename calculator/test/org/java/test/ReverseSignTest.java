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

public class ReverseSignTest {

    private ReverseSign reverseSign;

    @Before
    public void setUp() {
        reverseSign = new ReverseSign();
    }

    @Test
    public void executeUnaryTest0() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        reverseSign.executeUnary(mockVar0);
    }
}
