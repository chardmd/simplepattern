package com.patterns.flyweight;

public class Burger implements Sandwich {

	@Override
	public void serve(String toppings) {
		System.out.println("Serving Burger with " + toppings);
	}

}
