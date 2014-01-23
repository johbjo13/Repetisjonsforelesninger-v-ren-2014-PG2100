package FerdigKode;

public class PersonHandler {
 public static void main(String[] args) {
	
	Person person = new Person("Geir", "Hansen", "11111");
	Student student = new Student("Hans", "Geirseb", "22222", "123", 1);
	Employee employee = new Employee("Jon", "Jonsen", "3333", "321", 10);
	Person mixedUp = new Student("Sanh", "Besreig", "55555", "666", 123123);
	Person[] alle = {person, student,employee, mixedUp};
	
	for (int i = 0; i < alle.length; i++) {
		System.out.println(alle[i].toString());
	}
}
}
