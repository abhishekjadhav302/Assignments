package If_else_topic;

import java.util.Scanner;

public class Q3_BiggestAmongTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Three numbers one by one!");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		sc.close();

		if (num1 > num2) {
			System.out.println("Num1 is greater! " + num1);
		} else if (num2 > num3) {
			System.out.println("Num2 is greater! " + num2);
		}else {
			System.out.println("Num3 is greater!" + num3);
		}
	}

}
