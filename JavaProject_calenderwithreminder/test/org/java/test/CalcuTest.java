package org.java.test;

import calendar.*;
import data.*;
import window.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class CalcuTest {

    private Calcu calcu;

    @Before
    public void setUp() {
        calcu = new Calcu();
    }

    @Test
    public void initComponentTest0() {
        calcu.initComponent();
    }

    @Test
    public void actionPerformedTest1() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        calcu.actionPerformed(mockVar0);
    }
}
