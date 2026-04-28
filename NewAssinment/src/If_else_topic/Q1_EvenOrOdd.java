package If_else_topic;

import java.util.Scanner;

public class Q1_EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		if(num1%2==0 && num2%2==0) {
			
			System.out.println("These numbers are even!");
			if(num1 > num2) {
				System.out.println("Number first is large! " + num1);
			}else {
				System.out.println("Number second is large! " + num2);
			}

		}else {
			System.out.println("It is a odd number");
		}
		
	}

}
