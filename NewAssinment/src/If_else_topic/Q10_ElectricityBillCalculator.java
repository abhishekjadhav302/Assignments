package If_else_topic;

import java.util.Scanner;

public class Q10_ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter consumed units by consumer: ");

		int units = sc.nextInt();

		if (units <= 100) {
			System.out.println("5 rs/unit");

		} else if (units > 100 && units <= 300) {
			System.out.println("7 rs/unit");

		} else if (units > 300) {
			System.out.println("10 rs/unit");
		} else {
			System.err.println("Enter proper nums of units!");
		}

	}

}
