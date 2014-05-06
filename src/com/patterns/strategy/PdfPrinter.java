package com.patterns.strategy;

public class PdfPrinter implements Printer {
	
	public PdfPrinter() {
		System.out.println("Initializing PDF Printer..");
	}
	
	@Override
	public void print(String message) {
		System.out.println("Printing the message in PDF format: " + message);
	}
	
}
