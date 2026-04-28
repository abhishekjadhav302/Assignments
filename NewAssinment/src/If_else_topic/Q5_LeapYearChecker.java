package If_else_topic;

import java.util.Scanner;

public class Q5_LeapYearChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year: ");

		int year = sc.nextInt();
		sc.close();

		if (year % 4 == 0) {
//			System.out.println("This is a leap year!");

			if (year % 100 == 0) {
//				System.out.println("Sentury Complited..!");

				if (year % 400 == 0) {
					System.out.println(year + " is a leap year!");
				} else {
					System.err.println(year + " is not a leap year.");
				}
			} else {
				System.out.println(year + " is a leap year!");

			}
		} else {
			System.err.println(year + " is not leap year.");
		}
	}

}
