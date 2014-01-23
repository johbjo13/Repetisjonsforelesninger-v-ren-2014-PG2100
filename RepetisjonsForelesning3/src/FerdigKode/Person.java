package FerdigKode;

public class Person {
	private String firstName;
	private String lastName;
	private String SocialSecurityNumber;
	
	public Person(String firstName, String lastName, String socialSecurityNumber) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		SocialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", SocialSecurityNumber=" + SocialSecurityNumber + "]";
	}
}
