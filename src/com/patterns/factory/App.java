package com.patterns.factory;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample - Factory Pattern
 * We create object without exposing the creating logic
 * to the client and refer to the newly created object
 * using a common interface.
 */
public class App {

	public static void main(String[] args) {
		
		Operation operation = OperationFactory.getOperation(OperationType.ADD);
		operation.calculate(20, 10);
		
		operation = OperationFactory.getOperation(OperationType.SUBTRACT);
		operation.calculate(20, 10);
		
		operation = OperationFactory.getOperation(OperationType.MULTIPLY);
		operation.calculate(20, 10);
		
		operation = OperationFactory.getOperation(OperationType.DIVIDE);
		operation.calculate(20, 10);
	}
}
