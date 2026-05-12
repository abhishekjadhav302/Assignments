package for_loop_topic;

import java.util.Scanner;

public class Q11_SumNaturalNum {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int j = 0;
		for (int i = 1; i < num; i++) {
			j += i;
		}
		System.out.println(j);
		
//		================ while loop method =================

/*	
		int j = 0;
		int i = 1;
		while(i <= num) {
			j += i
			i++;
		}
		System.out.println(j);	
*/		

	}
}
