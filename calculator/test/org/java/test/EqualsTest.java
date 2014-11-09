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

public class EqualsTest {

    private Equals equals;

    @Before
    public void setUp() {
        equals = new Equals();
    }

    @Test
    public void executeTest0() {
        Cpu mockVar0;
        mockVar0 = EasyMock.createMock(Cpu.class);
        equals.execute(mockVar0);
    }
}
