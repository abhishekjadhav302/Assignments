package If_else_topic;

import java.util.Scanner;

public class Q4_triangleValidity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter triangle angles!");

		System.out.println("Enter first angle: ");
		int angle1 = sc.nextInt();

		System.out.println("Enter second angle: " );
		int angle2 = sc.nextInt();
		
		int twoSum = angle1 + angle2;

		System.out.println("Enter thired angle: " + twoSum);
		int angle3 = sc.nextInt();
		
		sc.close();

		int sum = angle1 + angle2 + angle3;

		if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
			System.out.println("It's a valid triangle...!");
		}else {
			System.out.println("It's not a valid triangle.");
		}
	}

}
