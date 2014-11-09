package org.java.test;

import com.objectsbydesign.calc.model.*;
import com.objectsbydesign.calc.view.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.easymock.EasyMock;

public class KeyPanelTest {

    private KeyPanel keyPanel;

    @Before
    public void setUp() {
        keyPanel = new KeyPanel(null);
    }

    @Test
    public void getOperationHandlerTest0() {
        keyPanel.getOperationHandler();
    }
}
