package com.patterns.template;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample - Template Pattern
 * It defines an outline of an algorithm and 
 * let the subclasses to redefine the implementation
 * without changing the algorithm's structure.
 *
 */

public class App {

	public static void main(String[] args) {
		RecipeTemplate saladRecipe = new SaladRecipe();
		saladRecipe.cook();
		
		RecipeTemplate eggRecipe = new EggRecipe();
		eggRecipe.cook();
	}
}
