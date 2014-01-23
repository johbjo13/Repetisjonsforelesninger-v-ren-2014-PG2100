package FerdigKode;

public class Student extends Person {
		private String studentNumber;
		private int credits;
		
		public Student(String firstName, String lastName,
				String socialSecurityNumber, String studentNumber, int credits) {
			super(firstName, lastName, socialSecurityNumber);
			this.studentNumber = studentNumber;
			this.credits = credits;
		}

		public String getStudentNumber() {
			return studentNumber;
		}

		public void setStudentNumber(String studentNumber) {
			this.studentNumber = studentNumber;
		}

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		@Override
		public String toString() {
			return super.toString()+ " Student [studentNumber=" + studentNumber + ", credits="
					+ credits + "]";
		}
		
	
}
