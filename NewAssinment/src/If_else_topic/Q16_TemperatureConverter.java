package If_else_topic;

import java.util.Scanner;

public class Q16_TemperatureConverter {

	public static double temp(double C, double F) {

		C = (F - 32) * 5 / 9;
		
		F = (C * 9 / 5) + 32;

		return temp(C, F);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a temperature only: \n");
		Double tempNum = sc.nextDouble();
		
		System.out.println(tempNum);
		
		

	}
}