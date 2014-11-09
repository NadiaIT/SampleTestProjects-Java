package org.java.test;

import com.objectsbydesign.calc.model.BinaryOperation;
import com.objectsbydesign.calc.view.CalculatorTape;
import com.objectsbydesign.calc.model.Cpu;
import com.objectsbydesign.calc.model.DecimalValue;
import com.objectsbydesign.calc.model.Display;
import com.objectsbydesign.calc.view.DisplayPanel;
import com.objectsbydesign.calc.model.EnteringNumberState;
import com.objectsbydesign.calc.model.Equals;
import com.objectsbydesign.calc.model.OperandCommand;
import com.objectsbydesign.calc.model.OperandStack;
import com.objectsbydesign.calc.model.Operation;
import com.objectsbydesign.calc.model.OperationCommand;
import com.objectsbydesign.calc.model.OperationStack;
import com.objectsbydesign.calc.model.Plus;
import com.objectsbydesign.calc.model.Register;
import com.objectsbydesign.calc.model.Value;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class enterOperationTest {

    private BinaryOperation binaryOperation;

    private CalculatorTape calculatorTape;

    private Cpu cpu;

    private DecimalValue decimalValue;

    private Display display;

    private DisplayPanel displayPanel;

    private EnteringNumberState enteringNumberState;

    private Equals equals;

    private OperandCommand operandCommand;

    private OperandStack operandStack;

    private Operation operation;

    private OperationCommand operationCommand;

    private OperationStack operationStack;

    private Plus plus;

    private Register register;

    @Before
    public void setUp() {
        binaryOperation = null;
        calculatorTape = new CalculatorTape(new Cpu());
        cpu = new Cpu();
        decimalValue = new DecimalValue(1.0);
        display = new Display(null);
        displayPanel = new DisplayPanel();
        enteringNumberState = new EnteringNumberState(new Cpu());
        equals = new Equals();
        operandCommand = new OperandCommand(null);
        operandStack = new OperandStack();
        operation = null;
        operationCommand = new OperationCommand(null);
        operationStack = new OperationStack();
        plus = new Plus();
        register = new Register(null);
    }

    @Test
    public void enterOperationTest() {
        cpu.enterOperation("test");
        Operation var0;
        var0 = null;
        enteringNumberState.enterOperation(var0);
        cpu.pushDisplayRegister();
        display.createValue();
        Value var1;
        var1 = null;
        register.setValue(null);
        decimalValue.create("test");
        decimalValue.toString();
        Observable var2;
        var2 = null;
        Object var3;
        var3 = null;
        displayPanel.update(var2, var3);
        displayPanel.setDisplay("test");
        register.getValue();
        Value var4;
        var4 = null;
        operandStack.push(var4);
        Observable var5;
        var5 = null;
        Object var6;
        var6 = null;
        calculatorTape.update(var5, var6);
        operandCommand.display();
        decimalValue.toString();
        Operation var7;
        var7 = null;
        cpu.pushOperation(var7);
        operationStack.empty();
        operationStack.peek();
        operation.getPrecedence();
        operation.getPrecedence();
        operationStack.pop();
        Cpu var8;
        var8 = new Cpu();
        binaryOperation.execute(var8);
        cpu.getOperandStack();
        operandStack.pop();
        operandStack.pop();
        Value var9;
        var9 = null;
        Value var10;
        var10 = null;
        plus.executeBinary(var9, var10);
        Value var11;
        var11 = null;
        decimalValue.add(var11);
        Value var12;
        var12 = null;
        operandStack.push(var12);
    }
}
