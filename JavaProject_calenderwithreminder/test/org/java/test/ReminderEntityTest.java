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

public class ReminderEntityTest {

    private ReminderEntity reminderEntity;

    @Before
    public void setUp() {
        reminderEntity = new ReminderEntity();
    }

    @Test
    public void getDateTest0() {
        reminderEntity.getDate();
    }

    @Test
    public void setDateTest1() {
        reminderEntity.setDate(1);
    }

    @Test
    public void getMonthTest2() {
        reminderEntity.getMonth();
    }

    @Test
    public void setMonthTest3() {
        reminderEntity.setMonth("test");
    }

    @Test
    public void getYearTest4() {
        reminderEntity.getYear();
    }

    @Test
    public void setYearTest5() {
        reminderEntity.setYear(1);
    }

    @Test
    public void getOccationTest6() {
        reminderEntity.getOccation();
    }

    @Test
    public void setOccationTest7() {
        reminderEntity.setOccation("test");
    }
}
