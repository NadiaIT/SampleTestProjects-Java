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

public class ReminderTest {

    private Reminder reminder;

    @Before
    public void setUp() {
        reminder = new Reminder();
    }

    @Test
    public void addComponentsTest0() {
        reminder.addComponents();
    }

    @Test
    public void actionPerformedTest1() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        reminder.actionPerformed(mockVar0);
    }
}
