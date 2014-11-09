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

public class ProjectTest {

    private Project project;

    @Before
    public void setUp() {
        project = new Project();
    }

    @Test
    public void initComponentsTest0() {
        project.initComponents();
    }
}
