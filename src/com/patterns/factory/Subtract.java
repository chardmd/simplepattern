package com.patterns.factory;

public class Subtract implements Operation {

	@Override
	public void calculate(int num1, int num2) {
		String message = String.format("The difference of %s and %s = %s", num1, num2, num1 - num2);
		System.out.println(message);
	}

}
