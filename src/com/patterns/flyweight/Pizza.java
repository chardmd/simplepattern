package com.patterns.flyweight;

public class Pizza implements Sandwich {

	@Override
	public void serve(String toppings) {
		System.out.println("Serving Pizza with " + toppings);
	}

}
