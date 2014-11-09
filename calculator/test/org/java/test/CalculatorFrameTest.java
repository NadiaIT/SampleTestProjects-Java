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

public class CalculatorFrameTest {

    private CalculatorFrame calculatorFrame;

    @Before
    public void setUp() {
        calculatorFrame = new CalculatorFrame(null);
    }
}
