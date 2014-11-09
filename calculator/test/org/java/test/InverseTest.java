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

public class InverseTest {

    private Inverse inverse;

    @Before
    public void setUp() {
        inverse = new Inverse();
    }

    @Test
    public void executeUnaryTest0() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        inverse.executeUnary(mockVar0);
    }
}
