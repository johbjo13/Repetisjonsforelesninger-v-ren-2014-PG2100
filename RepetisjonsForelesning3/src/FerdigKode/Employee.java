package FerdigKode;

public class Employee extends Person {
	private String employeeNumber;
	private int salary;
	
	public Employee(String firstName, String lastName,
			String socialSecurityNumber,String employeeNumber, int salary) {
		super(firstName, lastName, socialSecurityNumber);
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() +" Employee [employeeNumber=" + employeeNumber + ", salary="
				+ salary + "]";
	}

}
