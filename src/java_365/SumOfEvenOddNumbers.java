package java_365;

import java.util.Scanner;

class SumOfEvenOddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the starting range: ");
		int start = sc.nextInt();

		System.out.print("Enter the ending range: ");
		int end = sc.nextInt();

		System.out.println("Choose an option:");
		System.out.println("1. Even Sum");
		System.out.println("2. Odd Sum");
		int choice = sc.nextInt();

		int evenSum = 0;
		int oddSum = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}

		if (choice == 1) {
			System.out.println("Sum of Even Numbers = " + evenSum);
		} else if (choice == 2) {
			System.out.println("Sum of Odd Numbers = " + oddSum);
		} else {
			System.out.println("Invalid choice! Please select 1 or 2.");
		}

		sc.close();
	}
}
