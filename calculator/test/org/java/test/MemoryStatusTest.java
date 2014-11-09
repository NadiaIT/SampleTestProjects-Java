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

public class MemoryStatusTest {

    private MemoryStatus memoryStatus;

    @Before
    public void setUp() {
        memoryStatus = new MemoryStatus();
    }

    @Test
    public void updateTest0() {
        Observable mockVar0;
        mockVar0 = EasyMock.createMock(Observable.class);
        Object mockVar1;
        mockVar1 = EasyMock.createMock(Object.class);
        memoryStatus.update(mockVar0, mockVar1);
    }
}
