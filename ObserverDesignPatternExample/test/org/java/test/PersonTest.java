package org.java.test;

import org.arpit.javapostsforlearning.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        person = new Person("test");
    }

    @Test
    public void getPersonNameTest0() {
        person.getPersonName();
    }

    @Test
    public void setPersonNameTest1() {
        person.setPersonName("test");
    }

    @Test
    public void updateTest2() {
        person.update("test");
    }

    @Test
    public void unUsedMethodTest3() {
        person.unUsedMethod();
    }
}
