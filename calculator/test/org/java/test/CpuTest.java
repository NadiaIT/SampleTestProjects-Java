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

public class CpuTest {

    private Cpu cpu;

    @Before
    public void setUp() {
        cpu = new Cpu();
    }

    @Test
    public void enterOperationTest0() {
        cpu.enterOperation("test");
    }

    @Test
    public void enterDigitTest1() {
        cpu.enterDigit("test");
    }

    @Test
    public void pushDisplayRegisterTest2() {
        cpu.pushDisplayRegister();
    }

    @Test
    public void loadOperandTest3() {
        Value mockVar0;
        mockVar0 = EasyMock.createMock(Value.class);
        cpu.loadOperand(mockVar0);
    }

    @Test
    public void pushOperationTest4() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        cpu.pushOperation(mockVar0);
    }

    @Test
    public void executeOperationTest5() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        cpu.executeOperation(mockVar0);
    }

    @Test
    public void replaceOperationTest6() {
        Operation mockVar0;
        mockVar0 = EasyMock.createMock(Operation.class);
        cpu.replaceOperation(mockVar0);
    }

    @Test
    public void equalsTest7() {
        cpu.equals();
    }

    @Test
    public void updateDisplayTest8() {
        cpu.updateDisplay();
    }

    @Test
    public void clearTest9() {
        cpu.clear();
    }

    @Test
    public void resetTest10() {
        cpu.reset();
    }

    @Test
    public void addDisplayObserverTest11() {
        Observer mockVar0;
        mockVar0 = EasyMock.createMock(Observer.class);
        cpu.addDisplayObserver(mockVar0);
    }

    @Test
    public void addMemoryObserverTest12() {
        Observer mockVar0;
        mockVar0 = EasyMock.createMock(Observer.class);
        cpu.addMemoryObserver(mockVar0);
    }

    @Test
    public void setUpdateDisplayTest13() {
        cpu.setUpdateDisplay();
    }

    @Test
    public void getOperandStackTest14() {
        cpu.getOperandStack();
    }

    @Test
    public void getOperationStackTest15() {
        cpu.getOperationStack();
    }

    @Test
    public void getMemoryRegisterTest16() {
        cpu.getMemoryRegister();
    }

    @Test
    public void getDisplayRegisterTest17() {
        cpu.getDisplayRegister();
    }
}
