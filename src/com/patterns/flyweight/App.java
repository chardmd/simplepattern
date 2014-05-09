package com.patterns.flyweight;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample 
 * It allow you to reuse the memory spaces in an application
 * when you have alot of objects. It is best used for 
 * low memory devices like mobile devices, and embedded systems
 * Flyweight object has two properties - intrinsic and extrinsic
 */

public class App {

	public static void main(String[] args) {
		Sandwich sandwich;
		final int CUSTOMERS = 50;
		
		for (int i = 0; i <= CUSTOMERS; i++) {

			sandwich = SandwichFactory.getSandwich(SandwichType.BURGER);
			sandwich.serve("cheese");
			
			sandwich = SandwichFactory.getSandwich(SandwichType.BURGER);
			sandwich.serve("TLC");
			
			sandwich = SandwichFactory.getSandwich(SandwichType.BURGER);
			sandwich.serve("Brocolli");
			
			sandwich = SandwichFactory.getSandwich(SandwichType.PIZZA);
			sandwich.serve("Bacon");
			
			sandwich = SandwichFactory.getSandwich(SandwichType.PIZZA);
			sandwich.serve("Chili");
		}
		
		SandwichFactory.displayObjectsCreated();
	}

}
