package com.patterns.factory;

public class OperationFactory {

	public static Operation getOperation(OperationType operationType) {
		Operation operation = null;
		
		switch (operationType) {
		case ADD:
			operation = new Add();
			break;
		case SUBTRACT:
			operation = new Subtract();
			break;
		case MULTIPLY:
			operation = new Multiply();
			break;
		case DIVIDE:
			operation = new Divide();
			break;
		}
		return operation;
	}
}
