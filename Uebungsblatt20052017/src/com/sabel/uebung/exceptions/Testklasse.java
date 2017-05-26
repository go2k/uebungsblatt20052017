package com.sabel.uebung.exceptions;

public class Testklasse {

	public static void main(String[] args) {

		try {
			Person person1 = new Person(10);
			System.out.println(person1.toString());

			Person person2 = new Person(-10);
			System.out.println(person2.toString());

			Person person3 = new Person(155);
			System.out.println(person3.toString());

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 500; i++) {
			try {

				System.out.println(i + 1 + ":\t" + Zufall.getZufallszahl());

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		Monat monat;
		try {
			monat =   new Monat(2);
			monat.setMonat(13);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
