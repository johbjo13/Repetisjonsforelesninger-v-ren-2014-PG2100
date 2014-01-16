package kodeSnutter;

public class StudentEksempel {

	
	String studentnr;
	String firstName;
	String familyName;
	int credits;
	
	public StudentEksempel(String studentnr, String firstName,
			String familyName, int credits) {
	
		this.studentnr = studentnr;
		this.firstName = firstName;
		this.familyName = familyName;
		this.credits = credits;
	}

	
	
	
	public String getStudentnr() {
		return studentnr;
	}
	public void setStudentnr(String studentnr) {
		this.studentnr = studentnr;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String toString(){
		
		return studentnr + " " + firstName  + " " + familyName + " " + credits;
	}
}
