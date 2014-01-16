package oeving2;


public class DateProgram {
	public static void main(String[] args) {
		// Startdato
	
		// Henter ut dagens dato
		Date date = new Date();
		System.out.println(date.toString());
		
		// Kaller p� metoden nextDay i Date.
		date.nextDay();
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
		
		// setter datoen til ny fastsatt dato
		date = new Date(30, 4, 2011);
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
		date = new Date(31, 12, 2011);
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
		date = new Date(17, 1, 2012);
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
		date.nextDay();
		System.out.println(date.toString());
	}
}