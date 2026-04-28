package If_else_topic;

import java.util.Scanner;

public class Q6_GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input marks between 1 to 100: ");

		int marks = sc.nextInt();
		sc.close();

		if (marks < 0 || marks > 100) {
			System.err.println("Enter valid marks between 0 to 100..!");
		} else {
			switch (marks / 10) {
			case 10:
			case 9: {
				System.out.println("Grade A");
				break;
			}
			case 8: {
				System.out.println("Grade B");
				break;
			}
			case 7: {
				System.out.println("Grade C");
				break;
			}
			case 6: {
				System.out.println("Grade D");
				break;
			}
			default: {
				System.err.println("Grade F");
			}
			}
		}
	}
}
