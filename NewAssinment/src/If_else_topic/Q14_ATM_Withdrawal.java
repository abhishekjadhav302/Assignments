package If_else_topic;

import java.util.Scanner;

public class Q14_ATM_Withdrawal {

	public static int CreditedAmount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("First credit some amount in your account: ");
			Q14_ATM_Withdrawal.CreditedAmount = sc.nextInt();
			System.out.println("Amount has credited..!");

			int debitedAmount = 0;

			while (CreditedAmount > 0 && CreditedAmount >= debitedAmount) {
				System.out.println("Enter amount in 100 table: ");
				debitedAmount = sc.nextInt();

				if (debitedAmount % 100 == 0) {
					CreditedAmount -= debitedAmount;

					if (CreditedAmount < debitedAmount) {
						System.err.println("Insufficient balance.!");
					} else {
						System.out.println("Transaction completed...!");
						System.out.println("Your available balance: " + CreditedAmount);
						if(CreditedAmount == 0) {
							System.err.println("Your balance is 0...");
						};
					}
				} else if (debitedAmount % 100 != 0) {
					System.err.println("You are not putting required format amount..!");
					continue;
				}

//				int balanceCheck = CreditedAmount - debitedAmount;
//				if (balanceCheck <= 0) {
//					System.err.println("Insufficient balance..!");
////					break;
//				}

			}
			if (CreditedAmount <= 0) {
				System.err.println("Insufficient balance..!");
				continue;
			}
		}
		System.err.println("Insufficient Balance...!");
	}
}
