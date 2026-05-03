package If_else_topic;

import java.util.Scanner;

public class Q11_ExamPass_fail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Maths, Science & English marks: \n");
		
		System.out.println("Enter Maths marks: ");
		int Maths = sc.nextInt();
		
		System.out.println("Enter Science marks: ");
		int Sci = sc.nextInt();
		
		System.out.println("Enter English marks: ");
		int Eng = sc.nextInt();
		
		if(Maths < 33 && Sci < 33 && Eng < 33 ) {
			System.out.println("You are FAIL..!");
		} else {
			System.out.println("You are PASS..!");
		}
	}

}
