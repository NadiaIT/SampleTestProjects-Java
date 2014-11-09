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

public class MemoryRecallTest {

    private MemoryRecall memoryRecall;

    @Before
    public void setUp() {
        memoryRecall = new MemoryRecall();
    }

    @Test
    public void executeMemoryTest0() {
        memoryRecall.executeMemory();
    }
}
