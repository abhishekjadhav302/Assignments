package for_loop_topic;

import java.util.Scanner;

public class Q12_SumEvenNum {

	public static void main(String[] args) {
//		Q.12 - Sum of all even number 1 to n
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int input = sc.nextInt();
				
		int i = 0;
		int j;
		for(j = 1; j <= input; j++) {
			if(j % 2 == 0) {
				i += j;
			}
		}
		System.out.println(i);
	}

}
