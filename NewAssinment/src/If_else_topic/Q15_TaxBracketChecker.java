package If_else_topic;

import java.util.Scanner;

public class Q15_TaxBracketChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check tax on your income. \n");
		
		System.out.println("Enter Income: ");
		long income = sc.nextLong();
		
		if(income < 250000) {
			System.out.println("No tax");
		} else if(income >= 250000 && income < 500000) {
			System.out.println("5% tax on your income.");
		} else if(income >= 500000 && income < 1000000) {
			System.out.println("20% tax on your income.");
		} else if(income >= 1000000) {
			System.out.println("30% tax on your income.");
		} else {
			System.err.println("Enter valid income format..!");
		}
	}

}
