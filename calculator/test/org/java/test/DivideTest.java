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

public class DivideTest {

    private Divide divide;

    @Before
    public void setUp() {
        divide = new Divide();
    }

    @Test
    public void executeBinaryTest0() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        Value mockVar1;
        mockVar1 = EasyMock.createMock(Value.class);
        divide.executeBinary(mockVar0, mockVar1);
    }
}
