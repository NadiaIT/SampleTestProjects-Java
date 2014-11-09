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

public class MemoryTest {

    private Memory memory;

    @Before
    public void setUp() {
        memory = new Memory(null);
    }

    @Test
    public void setValueTest0() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        memory.setValue(mockVar0);
    }

    @Test
    public void clearTest1() {
        memory.clear();
    }
}
