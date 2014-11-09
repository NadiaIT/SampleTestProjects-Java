package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class MinMaxPlayerTest {

    private MinMaxPlayer minMaxPlayer;

    @Before
    public void setUp() {
        minMaxPlayer = new MinMaxPlayer();
    }

    @Test
    public void TerminalTestTest0() {
        State mockVar0;
        mockVar0 = EasyMock.createMock(State.class);
        minMaxPlayer.TerminalTest(mockVar0);
    }

    @Test
    public void UtilityTest1() {
        State mockVar0;
        mockVar0 = EasyMock.createMock(State.class);
        minMaxPlayer.Utility(mockVar0);
    }

    @Test
    public void getTypeTest2() {
        minMaxPlayer.getType();
    }

    @Test
    public void goTest3() {
        SimpleBoard mockVar0;
        mockVar0 = EasyMock.createMock(SimpleBoard.class);
        minMaxPlayer.go(mockVar0);
    }

    @Test
    public void setMoveTest4() {
        minMaxPlayer.setMove(1);
    }

    @Test
    public void display_treeTest5() {
        minMaxPlayer.display_tree();
    }
}
