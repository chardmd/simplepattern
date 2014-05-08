package com.patterns.strategy;

public class Client {

	private Printer printer;
	
	public Client(Printer printer) {
		this.printer = printer;
	}
	
	public void print(String message) {
		printer.print(message);
	}
}
