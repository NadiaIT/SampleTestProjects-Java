package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class HumanPlayerTest {

    private HumanPlayer humanPlayer;

    @Before
    public void setUp() {
        humanPlayer = new HumanPlayer();
    }

    @Test
    public void setMoveTest0() {
        humanPlayer.setMove(1);
    }

    @Test
    public void getTypeTest1() {
        humanPlayer.getType();
    }

    @Test
    public void goTest2() {
        SimpleBoard mockVar0;
        mockVar0 = EasyMock.createMock(SimpleBoard.class);
        humanPlayer.go(mockVar0);
    }
}
