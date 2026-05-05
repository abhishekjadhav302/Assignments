package for_loop_topic;

import java.util.Scanner;

public class Q3_Tables {
	
	static long tableNum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		tableNum = sc.nextLong();
		
		for(int i = 1; i <= 10; i++) {
			
			long result = tableNum * i;
			
			System.out.println(tableNum + " * " + i + " = " + result);
		}
	}

}
