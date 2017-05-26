package com.sabel.uebung.exceptions;

public class Zufall {

	public static int getZufallszahl() throws Exception {

		int zahl = (int) (Math.random() * 100);
		
			if (zahl == 0) {
				throw new Exception("Null wurde gezogen");
			}		
		return zahl;
	}
}
