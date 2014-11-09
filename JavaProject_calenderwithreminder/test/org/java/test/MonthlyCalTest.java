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

public class MonthlyCalTest {

    private MonthlyCal monthlyCal;

    @Before
    public void setUp() {
        monthlyCal = new MonthlyCal(1,1);
    }

    @Test
    public void printTest0() {
        monthlyCal.print(1, 1);
    }

    @Test
    public void actionPerformedTest1() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        monthlyCal.actionPerformed(mockVar0);
    }
}
