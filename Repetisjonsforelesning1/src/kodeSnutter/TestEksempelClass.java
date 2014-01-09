package kodeSnutter;




public class TestEksempelClass {

	
	
	public static void main(String[] args) {
		
		EksempelClass test = new EksempelClass();
		
		EksempelClass test2 = new EksempelClass("eksempel", 24, 34.3, false);
		
		if(test.getTekstAttributt().equals(test2.getTekstAttributt())){
			
			System.err.println("Like elementer");
		}; 
		
		System.out.println(test.toString());
		System.out.println(test.getTekstAttributt() + " " 
		+ test.getTallAttributt() + " " + test.getDesimaltallAttributt() + " " 
				+ test.trueFalseAttrubitt);
		
		
	}
}
