package kodeSnutter;

public class ThisExample {
	 int testVariable;  
	
	 public void testMethod(int testVariable) {  
		 	
		 	
	        System.out.println("Value of testVariable : " + testVariable);  
	        
	        // fikser vi slik at vi referer til riktig objekt ser output annerledes ut.
	        
	       //   System.out.println("Correct value of testVariable : " + this.testVariable);
	    }  
	


public static class TestMain { 
	
	public static void main(String[] args) {
		
		ThisExample object1 = new ThisExample();
		ThisExample object2 = new ThisExample();
		ThisExample object3 = new ThisExample();
		
		object1.testVariable = 10;
		object2.testVariable = 20;
		
		object1.testMethod(50);
		object2.testMethod(40);
		object3.testMethod(30);
		
		
}	
	
	
}

}