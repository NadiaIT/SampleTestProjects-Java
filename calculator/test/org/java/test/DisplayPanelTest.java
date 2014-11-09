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

public class DisplayPanelTest {

    private DisplayPanel displayPanel;

    @Before
    public void setUp() {
        displayPanel = new DisplayPanel();
    }

    @Test
    public void getMemoryStatusTest0() {
        displayPanel.getMemoryStatus();
    }

    @Test
    public void setDisplayTest1() {
        displayPanel.setDisplay("test");
    }

    @Test
    public void updateTest2() {
        Observable mockVar0;
        mockVar0 = EasyMock.createMock(Observable.class);
        Object mockVar1;
        mockVar1 = EasyMock.createMock(Object.class);
        displayPanel.update(mockVar0, mockVar1);
    }
}
