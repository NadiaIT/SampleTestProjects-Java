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

public class SequenceTest {

	Checker checker;

	ReminderDAO reminderDAO;

	ReminderEntity reminderEntity;

	@Before
	public void setUp() {
		checker = new Checker();
		reminderDAO = new ReminderDAO();
		reminderEntity = new ReminderEntity();
	}

	@Test
	public void sequenceTest() {
		checker.check();
		reminderDAO.get();
		reminderEntity.getDate();
		reminderEntity.getMonth();
	}
}
