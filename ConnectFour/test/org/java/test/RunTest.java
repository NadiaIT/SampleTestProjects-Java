package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class RunTest {

    private Run run;

    @Before
    public void setUp() {
        run = new Run();
    }

    @Test
    public void createMenuBarTest0() {
        run.createMenuBar();
    }

    @Test
    public void actionPerformedTest1() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        run.actionPerformed(mockVar0);
    }

    @Test
    public void itemStateChangedTest2() {
        ItemEvent mockVar0;
        mockVar0 = EasyMock.createMock(ItemEvent.class);
        run.itemStateChanged(mockVar0);
    }
}
