package com.anaroja.calculator;

public class Calculator implements Operators, java.io.Serializable{
	private double OperandOne;
	private char Operation; 
	private double OperandTwo; 
	private double result;
	
	public Calculator() {
	}
	//getter
	public double getOperandOne() {
		return OperandOne;
	}
	//setter
	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}
	//getter
	public char getOperation() {
		return Operation;
	}
	//setter
	public void setOperation(char operation) {
		Operation = operation;
	}
	//getter
	public double getOperandTwo() {
		return OperandTwo;
	}
	//setter
	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	//getter
	public double getResult() {
		return result;
	}
	//setter
	public void setResult(double result) {
		this.result = result;
	} 
	
	@Override
	public void performOperation () {
		if (Operation == '+') {
			result = OperandOne + OperandTwo;
		}
		else if (Operation == '-') {
			result = OperandOne - OperandTwo;
		}
	}
	
	@Override
	public void getResults() {
		System.out.println(result);
	}
	
}
