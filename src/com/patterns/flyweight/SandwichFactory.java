package com.patterns.flyweight;

import java.util.HashMap;

public class SandwichFactory {

	private static HashMap<SandwichType, Sandwich> sandwichList = new HashMap<SandwichType, Sandwich>();
	
	public static Sandwich getSandwich(SandwichType type) {
		Sandwich sandwich = sandwichList.get(type);
		if (sandwich == null) {
			if (type.equals(SandwichType.BURGER)) {
				sandwich = new Burger();
			} else if (type.equals(SandwichType.PIZZA)) {
				sandwich = new Pizza();
			}
			sandwichList.put(type, sandwich);
		}
		return sandwich;
	}
	
	public static void displayObjectsCreated() {
		System.out.println("Number of objects created: " + sandwichList.size());
	} 
}
