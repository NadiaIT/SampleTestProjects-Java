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

public class DatabaseManagerTest {

    private DatabaseManager databaseManager;

    @Before
    public void setUp() {
        databaseManager = new DatabaseManager();
    }

    @Test
    public void executeUpdateTest0() {
        databaseManager.executeUpdate("test");
    }

    @Test
    public void executeQueryTest1() {
        databaseManager.executeQuery("test");
    }

    @Test
    public void closeConnectionTest2() {
        databaseManager.closeConnection();
    }
}
