package kodeSnutter;

import java.lang.reflect.Array;

public class TestStudentEksempel {

	
	private static StudentEksempel [] studenter;

	public static void main(String[] args) {
		// Lager student-objekter
		StudentEksempel student1 = new StudentEksempel("399","Geir", "Hansen", 200);
		StudentEksempel student2 = new StudentEksempel("400","Mons", "Geirsen", 123);
		StudentEksempel student3 = new StudentEksempel("401","Alf", "Johnsen", 342);
		StudentEksempel student4 = new StudentEksempel("402","Asdf", "Asdfsen", 465);
		StudentEksempel student5 = new StudentEksempel("403","Navn", "Navnesen", 1);
		StudentEksempel student6 = new StudentEksempel("404","Denduvet", "Hysj", 231);
		// Legger studentene inn i array
		studenter = new StudentEksempel[] { student1, student2, student3, 
				student4, student5, student6};
		
		
		
		// For hvert student element i arrayen studenters
		for (StudentEksempel student : studenter){
			// Hvis det finnes studenter i arrayen
			if(student != null){
				
				// Legger inn et skikkelig navn på 'Asdfsen'
				if(student.getFamilyName().equalsIgnoreCase("Geirsen")){
					 student.setFamilyName("Arnesen");
					 student.setFirstName("Arne");
					 student.setCredits(student.getCredits() -10);
				}
				else{
				// Øker credits til de øvrige
				student.setCredits(student.getCredits() +1);
				
				}
				// Kaller på StudentEksempel sin toString og printer ut studentene.
				
				System.out.println(student.toString());
			}
			
		}
		
	}
	
}
