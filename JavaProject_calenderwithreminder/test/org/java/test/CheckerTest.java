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

public class CheckerTest {

    private Checker checker;

    @Before
    public void setUp() {
        checker = new Checker();
    }

    @Test
    public void checkTest0() {
        checker.check();
    }

    @Test
    public void getDateTest1() {
        checker.getDate();
    }
}
