package com.sabel.uebung.exceptions;


//checked Exception

public class Monatsausnahme extends Exception {

	public Monatsausnahme(String message) {
		super(message);
		System.out.println("Monatsausnahme ausgelöst...................");
	}
	
}
