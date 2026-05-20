package arrayUseCases_Q43_Q44;

public class Q43_StudentHelper {

	public void arrayPrint(Q43_StudentEntity ent) {

		int above75 = 0;

		for (int i = 0; i < ent.score.length; i++) {
			if (ent.score[i] > 75) {
				System.out.println("Student " + (i + 1) + " scored 75+: " + ent.score[i]);
				above75++;
			}
		}

		int below75 = ent.score.length - above75;

		System.out.println("count of people below 75- : " + below75);

		if (above75 == 0) {
			System.out.println("\nno one above 75");
		}

		int count = 0;

		for (int j = 0; j < ent.score.length; j++) {

			if (ent.score[j] >= 40) {
				count++;
			}
		}
		System.err.println("\n  Q44_How many students pass (marks >= 40)");
		System.out.println("\nAbove 40+ : " + count);
	}
}