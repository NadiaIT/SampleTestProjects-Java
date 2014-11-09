package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class RandomPlayerTest {

    private RandomPlayer randomPlayer;

    @Before
    public void setUp() {
        randomPlayer = new RandomPlayer();
    }

    @Test
    public void setMoveTest0() {
        randomPlayer.setMove(1);
    }

    @Test
    public void getTypeTest1() {
        randomPlayer.getType();
    }

    @Test
    public void goTest2() {
        SimpleBoard mockVar0;
        mockVar0 = EasyMock.createMock(SimpleBoard.class);
        randomPlayer.go(mockVar0);
    }
}
