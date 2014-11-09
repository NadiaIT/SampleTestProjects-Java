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

public class NimbusTest {

    private Nimbus nimbus;

    @Before
    public void setUp() {
        nimbus = new Nimbus();
    }

    @Test
    public void looksTest0() {
        nimbus.looks();
    }
}
