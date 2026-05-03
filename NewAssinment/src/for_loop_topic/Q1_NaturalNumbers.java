package for_loop_topic;

import java.util.Scanner;

public class Q1_NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print all natural numbers from 1 to n: \n");
		
		System.out.println("Enter number: ");
		int input = sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			System.out.println(i);
		}
	}

}
