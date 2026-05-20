package arrayUseCases_Q43_Q44;

import java.util.Scanner;

public class Test_Q43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int arrSize = sc.nextInt();

		Q43_StudentEntity entity = new Q43_StudentEntity(arrSize);

		for (int i = 0; i < entity.score.length; i++) {
			if (i < entity.score.length) {
				System.out.println("Enter the " + (i + 1) + " student mark: ");
				entity.score[i] = sc.nextInt();
			} else {
				System.out.println("Array is full! You cannot enter more student marks..!");
			}
		}

		Q43_StudentHelper helper = new Q43_StudentHelper();
		helper.arrayPrint(entity);
	}
}