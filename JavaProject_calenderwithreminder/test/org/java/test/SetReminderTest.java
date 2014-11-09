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

public class SetReminderTest {

    private SetReminder setReminder;

    @Before
    public void setUp() {
        setReminder = new SetReminder("test",1,1);
    }

    @Test
    public void reminderFrameTest0() {
        setReminder.reminderFrame();
    }

    @Test
    public void addReminderTest1() {
        setReminder.addReminder();
    }

    @Test
    public void actionPerformedTest2() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        setReminder.actionPerformed(mockVar0);
    }
}
