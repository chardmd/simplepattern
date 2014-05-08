package com.patterns.template;

public abstract class RecipeTemplate {

	public final void cook() {
		getIngridients();
		mixIngridients();
		prepare();
		putToPlate();
	}
	
	public abstract void getIngridients();
	
	public abstract void mixIngridients();
	
	public abstract void prepare();
	
	private void putToPlate() {
		System.out.println("Done.. start food presentation.");
	}
		
}
