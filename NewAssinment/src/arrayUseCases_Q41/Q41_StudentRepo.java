package arrayUseCases_Q41;

public class Q41_StudentRepo {
	
	public static Q41_StudentEntities getStudent1() {
		Q41_StudentEntities entities1 = new Q41_StudentEntities();
		entities1.rollNo = 101;
		entities1.name = "Abhi";
		entities1.std = "10th";
		entities1.div = 'A';
		
		return entities1;
	}
	public static Q41_StudentEntities getStudent2() {
		Q41_StudentEntities entities2 = new Q41_StudentEntities();
		entities2.rollNo = 102;
		entities2.name = "akash";
		entities2.std = "10th";
		entities2.div = 'B';
		
		return entities2;
	}
	public static Q41_StudentEntities getStudent3() {
		Q41_StudentEntities entities3 = new Q41_StudentEntities();
		entities3.rollNo = 101;
		entities3.name = "kedar";
		entities3.std = "10th";
		entities3.div = 'C';
		
		return entities3;
	}
	public static Q41_StudentEntities getStudent4() {
		Q41_StudentEntities entities4 = new Q41_StudentEntities();
		entities4.rollNo = 101;
		entities4.name = "rohan";
		entities4.std = "10th";
		entities4.div = 'D';
		
		return entities4;
	}
	public static Q41_StudentEntities getStudent5() {
		Q41_StudentEntities entities5 = new Q41_StudentEntities();
		entities5.rollNo = 101;
		entities5.name = "ganesh";
		entities5.std = "10th";
		entities5.div = 'E';
		
		return entities5;
	}
}
