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

public class ReminderDAOTest {

    private ReminderDAO reminderDAO;

    @Before
    public void setUp() {
        reminderDAO = new ReminderDAO();
    }

    @Test
    public void insertTest0() {
        ReminderEntity mockVar0;
        mockVar0 = EasyMock.createMock(ReminderEntity.class);
        reminderDAO.insert(mockVar0);
    }

    @Test
    public void deleteTest1() {
        ReminderEntity mockVar0;
        mockVar0 = EasyMock.createMock(ReminderEntity.class);
        reminderDAO.delete(mockVar0);
    }

    @Test
    public void updateTest2() {
        ReminderEntity mockVar0;
        mockVar0 = EasyMock.createMock(ReminderEntity.class);
        reminderDAO.update(mockVar0);
    }

    @Test
    public void getTest3() {
        reminderDAO.get();
    }
}
