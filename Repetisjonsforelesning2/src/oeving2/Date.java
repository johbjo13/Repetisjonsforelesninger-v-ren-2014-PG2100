package oeving2;

import java.util.Calendar;

public class Date {
    private int dayNumber;
    private int monthNumber;
    private int year;
    
    public Date(int dayNumber, int monthNumber, int year) {
        
    	
    	this.dayNumber = dayNumber;
        this.monthNumber = monthNumber-1; // justering siden Date returnerer 0-11
        this.year = year;
        
        
    }
    
    @SuppressWarnings("deprecation")
	public Date(){
    	java.util.Date dato = new java.util.Date();
    	int valueAdjust = 1900;
    	
    		this.dayNumber = dato.getDate();
        this.monthNumber = dato.getMonth();
        this.year = dato.getYear() + valueAdjust;

    }
    
    public String toString() {
        return dayNumber + ". " + month() + " " + year;
    }
    
    private String month() {
    	String retur = "";
    	switch(monthNumber) {
	        case(0): retur = "januar"; break;
	        case(1): retur = "februar"; break;
	        case(2): retur = "mars"; break;
	        case(3): retur = "april"; break;
	        case(4): retur = "mai"; break;
	        case(5): retur = "juni"; break;
	        case(6): retur = "juli"; break;
	        case(7): retur = "august"; break;
	        case(8): retur = "september"; break;
	        case(9): retur = "oktober"; break;
	        case(10): retur = "november"; break;
	        case(11): retur = "desember"; break;
	        default: retur = "ugyldig"; break;
    	}
    	return retur;
    }
    
    public void nextDay() {
    	dayNumber++;
    	
    	// januar = 0, mars = 2, mai = 4, juli = 6, august = 7, oktober = 9, desember = 11
        if (monthNumber == 0 || monthNumber == 2 || monthNumber == 4 ||
        	monthNumber == 6 || monthNumber == 7 || monthNumber ==9 ||
        	monthNumber == 11) {
        	// Hvis dato overstiger 31, neste mnd
            if (dayNumber == 32) {
            	dayNumber = 1;
            	monthNumber++;
            	//Hvis m�ned overstiger 11 mnd, sett mnd til 0 og legg til et �r
                if (monthNumber == 12) {
                	monthNumber = 0;
                    year++;
                }
            }
        }
        
        // H�ndterer februar
        else
         if (monthNumber == 1) {
            if (dayNumber == 29) {
            	dayNumber = 1;
            	monthNumber = 2;
            }
        }
        //april, juni, september.
        
        else
        if (monthNumber == 3 || monthNumber == 5 || monthNumber == 8 ||
        		monthNumber == 10) {
            if (dayNumber == 31) {
            	dayNumber = 1;
            	monthNumber++;
            }
        }
    }
        
}
