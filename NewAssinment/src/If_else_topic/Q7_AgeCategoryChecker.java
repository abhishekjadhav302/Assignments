package If_else_topic;

import java.util.Scanner;

public class Q7_AgeCategoryChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");

		int age = sc.nextInt();
		sc.close();

		if (age >= 0 && age <= 12) {
			System.out.println("You are Child!");
		} else if (age >= 13 && age <= 17) {
			System.out.println("You are Teen!");
		} else if (age >= 18 && age < 60) {
			System.out.println("You are Adult!");
		} else if (age >= 60) {
			System.out.println("You are Senior!");
		}
	}

}
