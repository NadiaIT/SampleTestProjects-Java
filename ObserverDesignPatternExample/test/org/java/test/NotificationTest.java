package org.java.test;

import org.arpit.javapostsforlearning.ObserverPatternMain;
import org.arpit.javapostsforlearning.Person;
import org.arpit.javapostsforlearning.Product;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class NotificationTest {

    private ObserverPatternMain observerPatternMain;

    private Person person;

    private Product product;

    @Before
    public void setUp() {
        observerPatternMain = new ObserverPatternMain();
        person = new Person("test");
        product = new Product("test","test","test");
    }

    @Test
    public void NotificationTest() {
        product.setAvailability("test");
        product.notifyObservers();
        person.update("test");
        product.getAvailability();
    }
}
