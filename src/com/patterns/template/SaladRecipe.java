package com.patterns.template;

public class SaladRecipe extends RecipeTemplate {

	public void getIngridients() {
		System.out.println("Get fruits - Apple, orange, pineapple, berries, milk..");
	}
	
	@Override
	public void mixIngridients() {
		System.out.println("Slice the fruits and add milk..");
		
	}

	@Override
	public void prepare() {
		System.out.println("Put it in the freezer for 3 hours");
	}

}
