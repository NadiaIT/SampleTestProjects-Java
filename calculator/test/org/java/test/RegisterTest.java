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

public class RegisterTest {

    private Register register;

    @Before
    public void setUp() {
        register = new Register(null);
    }

    @Test
    public void getValueTest0() {
        register.getValue();
    }

    @Test
    public void setValueTest1() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        register.setValue(mockVar0);
    }

    @Test
    public void setValueTest2() {
        register.setValue("test");
    }

    @Test
    public void clearTest3() {
        register.clear();
    }

    @Test
    public void resetTest4() {
        register.reset();
    }
}
