package com.anaroja.calculator;

public class OperatorsTest {

	public static void main(String[] args) {
		Calculator operation1 = new Calculator();
		operation1.setOperandOne(10.5);
		operation1.setOperation('+');
		operation1.setOperandTwo(5.2);
		operation1.performOperation();
		operation1.getResults();

	}

}
