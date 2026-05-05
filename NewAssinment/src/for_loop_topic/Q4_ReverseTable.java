package for_loop_topic;

import java.util.Scanner;

public class Q4_ReverseTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter table number for reverse: ");	
		long tableNum = sc.nextLong();
		
		for(int i = 10; i >= 1; i--) {
			long result = tableNum * i;
			System.out.println(tableNum + " * " + i + " = " + result);
		}
	}

}
