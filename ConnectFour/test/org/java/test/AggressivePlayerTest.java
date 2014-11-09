package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class AggressivePlayerTest {

    private AggressivePlayer aggressivePlayer;

    @Before
    public void setUp() {
        aggressivePlayer = new AggressivePlayer();
    }

    @Test
    public void setMoveTest0() {
        aggressivePlayer.setMove(1);
    }

    @Test
    public void getTypeTest1() {
        aggressivePlayer.getType();
    }

    @Test
    public void goTest2() {
        SimpleBoard mockVar0;
        mockVar0 = EasyMock.createMock(SimpleBoard.class);
        aggressivePlayer.go(mockVar0);
    }
}
