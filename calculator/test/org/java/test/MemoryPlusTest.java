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

public class MemoryPlusTest {

    private MemoryPlus memoryPlus;

    @Before
    public void setUp() {
        memoryPlus = new MemoryPlus();
    }

    @Test
    public void executeMemoryTest0() {
        memoryPlus.executeMemory();
    }
}
