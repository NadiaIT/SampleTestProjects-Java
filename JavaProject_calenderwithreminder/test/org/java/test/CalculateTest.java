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

public class CalculateTest {

    private Calculate calculate;

    @Before
    public void setUp() {
        calculate = new Calculate();
    }

    @Test
    public void addTest0() {
        calculate.add("test", "test");
    }

    @Test
    public void substractTest1() {
        calculate.substract("test", "test");
    }

    @Test
    public void multipleTest2() {
        calculate.multiple("test", "test");
    }

    @Test
    public void divisionTest3() {
        calculate.division("test", "test");
    }

    @Test
    public void modTest4() {
        calculate.mod("test", "test");
    }

    @Test
    public void sqrrtTest5() {
        calculate.sqrrt("test");
    }

    @Test
    public void sqrTest6() {
        calculate.sqr("test");
    }

    @Test
    public void invrseTest7() {
        calculate.invrse("test");
    }
}
