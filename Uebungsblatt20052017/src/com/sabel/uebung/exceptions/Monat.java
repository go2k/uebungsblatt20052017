package com.sabel.uebung.exceptions;

public class Monat {

	private int monat;
	
	public Monat(int monat) throws Monatsausnahme {
		super();
		setMonat(monat);
	}
	
	public void setMonat(int monat) throws Monatsausnahme{
		if (monat <1 || monat >12) {
			throw new Monatsausnahme("Falscher Monat: " + monat);
		}
		this.monat = monat;
	}
	
	public String getMonatsname() {
		switch (monat) {
		case 1:
			return "Januar";		
		case 2:
			return "Februar";
		case 3:
			return "März";
		case 4:
			return "April";
		case 5:
			return "Mai";
		case 6:
			return "Juni";
		case 7:
			return "Juli";
		case 8:
			return "August";
		case 9  :
			return "September";
		case 10:
			return "Oktober";
		case 11:
			return "November";
		case 12:
			return "Dezember";
		default:
			return null;
		}
	}
}
