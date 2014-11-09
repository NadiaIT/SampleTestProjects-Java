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

public class RemOrCalndrTest {

    private RemOrCalndr remOrCalndr;

    @Before
    public void setUp() {
        remOrCalndr = new RemOrCalndr();
    }

    @Test
    public void actionPerformedTest0() {
        ActionEvent mockVar0;
        mockVar0 = EasyMock.createMock(ActionEvent.class);
        remOrCalndr.actionPerformed(mockVar0);
    }
}
