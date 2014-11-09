package org.java.test;

import com.objectsbydesign.calc.model.Cpu;
import com.objectsbydesign.calc.model.DecimalValue;
import com.objectsbydesign.calc.model.Display;
import com.objectsbydesign.calc.view.DisplayPanel;
import com.objectsbydesign.calc.view.KeyPanel;
import com.objectsbydesign.calc.model.OperandStack;
import com.objectsbydesign.calc.model.OperationStack;
import com.objectsbydesign.calc.model.Register;
import com.objectsbydesign.calc.model.WaitingForInputState;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class enterDigitTest {

    private Cpu cpu;

    private DecimalValue decimalValue;

    private Display display;

    private DisplayPanel displayPanel;

    private KeyPanel keyPanel;

    private OperandStack operandStack;

    private OperationStack operationStack;

    private Register register;

    private WaitingForInputState waitingForInputState;

    @Before
    public void setUp() {
        cpu = new Cpu();
        decimalValue = new DecimalValue(1.0);
        display = new Display(null);
        displayPanel = new DisplayPanel();
        keyPanel = new KeyPanel(null);
        operandStack = new OperandStack();
        operationStack = new OperationStack();
        register = new Register(null);
        waitingForInputState = new WaitingForInputState(new Cpu());
    }

    @Test
    public void enterDigitTest() {
        cpu.enterDigit("test");
        waitingForInputState.enterDigit("test");
        display.reset();
        operandStack.clear();
        operationStack.clear();
        cpu.reset();
        decimalValue.addDigit("test", "test");
        register.reset();
        Observable var0;
        var0 = null;
        Object var1;
        var1 = null;
        displayPanel.update(var0, var1);
        display.addDigit("test");
        displayPanel.setDisplay("test");
    }
}
