package org.java.test;

import com.objectsbydesign.calc.model.*;
import com.objectsbydesign.calc.view.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class NumberPanelTest {

    private NumberPanel numberPanel;

    @Before
    public void setUp() {
        numberPanel = new NumberPanel(null);
    }
}
