package arrayUseCases_Q41;

public class Q41_Test {
	public static void main(String[] args) {
/*
//		Q41_StudentRepo repo = new Q41_StudentRepo();  //i have created object of this class
//		Q41_StudentEntities obj1 = repo.getStudent1(); //call method in that class

//		Q41_StudentHelper helper = new Q41_StudentHelper();
		
		Q41_StudentHelper.printStudent(Q41_StudentRepo.getStudent1());
		Q41_StudentHelper.printStudent(Q41_StudentRepo.getStudent2());
		Q41_StudentHelper.printStudent(Q41_StudentRepo.getStudent3());
		Q41_StudentHelper.printStudent(Q41_StudentRepo.getStudent4());
		Q41_StudentHelper.printStudent(Q41_StudentRepo.getStudent5());
*/
		
		Q41_UsingArray[] arr = new Q41_UsingArray[5];
		arr[0] = new Q41_UsingArray(101, "abhi", "A+", 'A');
		arr[1] = new Q41_UsingArray(102, "rakesh", "B+", 'B');
		arr[2] = new Q41_UsingArray(103, "ram", "AB+", 'C');
		arr[3] = new Q41_UsingArray(104, "sham", "B-", 'D');
		arr[4] = new Q41_UsingArray(105, "yash", "O-", 'E');
		
		for(int i = 0;  i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
