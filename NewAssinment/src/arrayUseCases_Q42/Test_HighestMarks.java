package arrayUseCases_Q42;

public class Test_HighestMarks {
	public static void main(String[] args) {
//		que 42: find and print the student with highest marks

		Q42_StudentRepo repo = new Q42_StudentRepo();
		Q42_StudentHelper printStd = new Q42_StudentHelper();

		Q42_StudentEnties[] stdArr = repo.stdDetailsArr();

		for (int i = 0; i < stdArr.length; i++) {
			Q42_StudentEnties highestMarks = stdArr[0]; // i have store 0th object in highestMarks variable
			int a = highestMarks.javaMarks; // i have taken in the 0th index java subject marks in a variable

			int b = stdArr[i].javaMarks;

			if (b > a) {
				highestMarks = stdArr[i];
				printStd.printStd(highestMarks);
			}

		}
/*
		System.out.println("=====================================");

		int[] stdMarks = { 77, 45, 84, 97, 35, 46, 70, 50 }; // 35,45,46,50,70,77,84,97
		int highest = stdMarks[0];

		for (int i = 0; i < stdMarks.length; i++) {
			if (stdMarks[i] > highest) {
				highest = stdMarks[i];
			}
		}
		System.out.println("Student Highest Marks: " + highest);
*/

		/*
		 * commented code int[] stdMarks = { 77, 45, 84, 97, 35, 46, 70, 50 }; //
		 * 35,45,46,50,70,77,84,97 int[] resultArr = {};
		 * 
		 * int oneStd = 0; for (int i = 0; i < stdMarks.length - 1; i++) { // int sndStd
		 * = 0; oneStd = stdMarks[i]; // System.out.println("first std: " + oneStd);
		 * 
		 * }
		 * 
		 * int sndStd = 0; for (int j = 1; j < stdMarks.length; j++) { sndStd =
		 * stdMarks[j]; // System.out.println("second std: " + sndStd);
		 * 
		 * // if(stdMarks[i] > stdMarks[j]) { // System.out.println("if condition: " +
		 * stdMarks[i]); // }
		 * 
		 * }
		 * 
		 * if (oneStd > sndStd) { resultArr={oneStd};
		 * System.out.println("if condition: " + oneStd); }
		 */
	}
}
