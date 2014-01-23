package FerdigKode;

import java.awt.Point;

public class FjerneFraArray {
	
	public static void main(String[] args) {
		
		// starter en array med gitte verdier
		String[] array = new String[]{"meh", "test1","test2","test3", "test4","test5","test6"};
		// lager en tom kopi av array med tomme verdier
		String[] tempArray = new String[array.length];
		
		// brukes til å beregne antall som ikke er null
		int counter = 0;
		// itererer igjennom array og setter �nsket fjernet string value til 'null'
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if (array[i].toString().equalsIgnoreCase("test2")){
				array[i] = null;
			}
			else{
			// i alle andre tilfeller enn "meh" addes de andre elementene i tempArray
				
			tempArray[counter] = array[i];
			++counter;
			}
		}
		// setter array lik tempArray for � starte arraylist p� null igjen.
		array = tempArray;
		
		System.out.println();
		System.out.println("Etter Behandling \n" );
		
		for (int i = 0; i < array.length; i++) {
			
		if(array[i] != null)	
			System.out.println(array[i]);
		}
	}
	
	
}
