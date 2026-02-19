package java_365;

import java.util.*;

/*
           *****LOGIC*****
Find the smallest number among two numbers.

Multiply that smallest number by 1, 2, 3, 4…

Each time check:

Is this number divisible by the other number?

The first number that satisfies this → LCM
*/

public class LCM {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the first number : ");
		int num2 = sc.nextInt();
		findLcm(num1, num2);
	}
//METHOD TO FIND LCM
	public static void findLcm(int num1, int num2) {
		int lcm = 0;
		int smallest = num1 < num2 ? num1 : num2;
		int greatest = num1 > num2 ? num1 : num2;
		for (int i = 1; i <= num1 * num2; i++) {
			lcm = smallest * i;
			if (lcm % greatest == 0) {
				break;
			}

		}
		System.out.println(lcm);

	}

}
