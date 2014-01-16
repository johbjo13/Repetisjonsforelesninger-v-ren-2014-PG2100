package kodeSnutter;

public class SwitchCaseEksempel {

	public static void main(String[] args) {

		int klasseTrinn;
		String dittTrinn;
		klasseTrinn = 2;

		switch (klasseTrinn) {
		case 1: dittTrinn = "1. klasse";
			break;

		case 2: dittTrinn = "2. klasse";
			break;
			
		case 3: dittTrinn = "3. Klasse";
			break;

		default:
			dittTrinn = "Du går da ikke her?";
			break;
		}
		System.out.println(dittTrinn);
	}

}