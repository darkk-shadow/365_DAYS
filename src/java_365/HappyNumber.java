package java_365;

import java.util.*;

public class HappyNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (temp != 0 && temp > 6) {
			sum = 0;
			while (temp != 0) {
				int digit = temp % 10;
				sum += digit * digit;
				temp = temp / 10;
			}
			temp = sum;
		}
		if (sum == 1) {
			System.out.println(num + " it is an happy number ");

		} else {
			System.out.println(num + " it is not an happy number ");
		}

	}

}
