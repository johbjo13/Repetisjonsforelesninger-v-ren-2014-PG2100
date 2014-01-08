package ferdigOeving;


import ferdigOeving.*;


public class TestEksempelClass {

	
	
	public static void main(String[] args) {
		
		EksempelClass test = new EksempelClass();
		
		EksempelClass test2 = new EksempelClass("eksempel", 24, 34.3, false);
		
		if(test.getTekstAttributt().equals(test2.getTekstAttributt())){
			
			System.err.println("Shit's similar y0");
		}; 
		
		System.out.println(test.toString());
		System.out.println(test.getTekstAttributt() + " " 
		+ test.getTallAttributt() + " " + test.getDesimaltallAttributt() + " " 
				+ test.trueFalseAttrubitt);
		
		
	}
}
