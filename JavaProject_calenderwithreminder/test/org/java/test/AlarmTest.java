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

public class AlarmTest {

    private Alarm alarm;

    @Before
    public void setUp() {
        alarm = new Alarm(1,1,1);
    }

    @Test
    public void getAlarmTest0() {
        alarm.getAlarm();
    }

    @Test
    public void reminderFrameTest1() {
        alarm.reminderFrame();
    }

    @Test
    public void remButtonsTest2() {
        alarm.remButtons();
    }

    @Test
    public void actionPerformedTest3() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        alarm.actionPerformed(mockVar0);
    }
}
