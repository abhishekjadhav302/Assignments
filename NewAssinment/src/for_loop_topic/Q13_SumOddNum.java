package for_loop_topic;

import java.util.Scanner;

public class Q13_SumOddNum {
// Sum of all odd numbers between 1 to n
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number(I will give sum of odd number between them): ");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
}
