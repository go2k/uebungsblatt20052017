package com.sabel.uebung.exceptions;

public class Person {

	private int lebensalter;

	public Person(int lebensalter) {
		super();
		setLebensalter(lebensalter);		
	}
	
	public int getLebensalter() {
		return lebensalter;
	}

	public void setLebensalter(int lebensalter) throws IllegalArgumentException  {
		if (lebensalter < 0 || lebensalter > 150) {				
			throw new IllegalArgumentException("kein gültiges Alter ( >= 0 und <= 150 )");
		}
		this.lebensalter = lebensalter;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lebensalter;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (lebensalter != other.lebensalter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [lebensalter=" + lebensalter + "]";
	}
	
	
}
