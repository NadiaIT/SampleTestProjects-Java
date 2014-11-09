package org.java.test;

import org.java.connect.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class SimpleBoardTest {

    private SimpleBoard simpleBoard;

    @Before
    public void setUp() {
        simpleBoard = new SimpleBoard();
    }

    @Test
    public void ParseMoveTest0() {
        simpleBoard.ParseMove("test");
    }

    @Test
    public void MoveTest1() {
        simpleBoard.Move(1);
    }

    @Test
    public void viewTest2() {
        simpleBoard.view();
    }

    @Test
    public void viewcolTest3() {
        simpleBoard.viewcol();
    }

    @Test
    public void clearTest4() {
        simpleBoard.clear();
    }

    @Test
    public void nextTest5() {
        simpleBoard.next();
    }

    @Test
    public void ret_colTest6() {
        simpleBoard.ret_col();
    }

    @Test
    public void overTest7() {
        simpleBoard.over();
    }

    @Test
    public void toStringTest8() {
        simpleBoard.toString();
    }
}
