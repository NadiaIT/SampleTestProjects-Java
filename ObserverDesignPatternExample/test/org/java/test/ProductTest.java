package org.java.test;

import org.arpit.javapostsforlearning.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class ProductTest {

    private Product product;

    @Before
    public void setUp() {
        product = new Product("test","test","test");
    }

    @Test
    public void notifyObserversTest0() {
        product.notifyObservers();
    }

    @Test
    public void registerObserverTest1() {
        Observer mockVar0;
        mockVar0 = EasyMock.createMock(Observer.class);
        product.registerObserver(mockVar0);
    }

    @Test
    public void removeObserverTest2() {
        Observer mockVar0;
        mockVar0 = EasyMock.createMock(Observer.class);
        product.removeObserver(mockVar0);
    }

    @Test
    public void getObserversTest3() {
        product.getObservers();
    }

    @Test
    public void setObserversTest4() {
        ArrayList<Observer> var0;
        var0 = new ArrayList<Observer>();
        product.setObservers(var0);
    }

    @Test
    public void getProductNameTest5() {
        product.getProductName();
    }

    @Test
    public void setProductNameTest6() {
        product.setProductName("test");
    }

    @Test
    public void getProductTypeTest7() {
        product.getProductType();
    }

    @Test
    public void setProductTypeTest8() {
        product.setProductType("test");
    }

    @Test
    public void getAvailabilityTest9() {
        product.getAvailability();
    }

    @Test
    public void setAvailabilityTest10() {
        product.setAvailability("test");
    }
}
