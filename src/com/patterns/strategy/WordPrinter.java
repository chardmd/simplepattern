package com.patterns.strategy;

public class WordPrinter implements Printer {
	
	public WordPrinter() {
		System.out.println("Initializing Word Printer..");
	}
	
	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println("Printing the message in WORD format: " + message);
	}

}
