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

public class MemoryClearTest {

    private MemoryClear memoryClear;

    @Before
    public void setUp() {
        memoryClear = new MemoryClear();
    }

    @Test
    public void executeMemoryTest0() {
        memoryClear.executeMemory();
    }
}
