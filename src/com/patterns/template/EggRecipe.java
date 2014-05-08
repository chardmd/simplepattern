package com.patterns.template;

public class EggRecipe extends RecipeTemplate {

	@Override
	public void getIngridients() {
		System.out.println("Get eggs and salt");
	}
	
	@Override
	public void mixIngridients() {
		System.out.println("Crack the egg and batter..");
	}

	@Override
	public void prepare() {
		System.out.println("Put it in the frying pan..");
		
	}

}
