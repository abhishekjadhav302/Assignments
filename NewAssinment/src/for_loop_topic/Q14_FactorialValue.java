package for_loop_topic;

import java.util.Scanner;

public class Q14_FactorialValue {
	// Q14. Sum of n factorial value
	static Scanner sc = new Scanner(System.in);


	// Here is the main method
	public static void main(String[] arg) {
		
		System.out.println("Enter number for factor: ");
		int input = sc.nextInt();

		int sum = 1;
		for (int i = 1; i <= input; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
