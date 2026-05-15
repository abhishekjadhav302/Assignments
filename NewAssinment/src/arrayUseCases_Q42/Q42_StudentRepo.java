package arrayUseCases_Q42;

//import Q42_StudentEnties;

public class Q42_StudentRepo {
	public Q42_StudentEnties[] stdDetailsArr() {

		Q42_StudentEnties std1 = new Q42_StudentEnties();
		std1.rollNo = 101;
		std1.name = "Abhi";
		std1.javaMarks = 85;

		Q42_StudentEnties std2 = new Q42_StudentEnties();
		std2.rollNo = 102;
		std2.name = "raghav";
		std2.javaMarks = 88;

		Q42_StudentEnties std3 = new Q42_StudentEnties();
		std3.rollNo = 103;
		std3.name = "raj";
		std3.javaMarks = 64;

		Q42_StudentEnties std4 = new Q42_StudentEnties();
		std4.rollNo = 104;
		std4.name = "kala";
		std4.javaMarks = 57;

		Q42_StudentEnties std5 = new Q42_StudentEnties();
		std5.rollNo = 105;
		std5.name = "Ravan";
		std5.javaMarks = 99;

		Q42_StudentEnties[] allStdArr = { std1, std2, std3, std4, std5 };

		return allStdArr;
	}
}
