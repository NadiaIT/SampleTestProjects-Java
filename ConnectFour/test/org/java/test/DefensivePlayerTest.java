package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class DefensivePlayerTest {

    private DefensivePlayer defensivePlayer;

    @Before
    public void setUp() {
        defensivePlayer = new DefensivePlayer();
    }

    @Test
    public void setMoveTest0() {
        defensivePlayer.setMove(1);
    }

    @Test
    public void getTypeTest1() {
        defensivePlayer.getType();
    }

    @Test
    public void goTest2() {
        SimpleBoard mockVar0;
        mockVar0 = EasyMock.createMock(SimpleBoard.class);
        defensivePlayer.go(mockVar0);
    }
}
