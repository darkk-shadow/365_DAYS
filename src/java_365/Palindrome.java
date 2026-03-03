package practice;

import java.util.*;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("enter the num : ");
		int num = sc.nextInt();
		boolean res = isPalindrome(num);
		if (res == true)
			System.out.println(num + " it is an palindrome");
		else
			System.out.println(num + " it is not an palindrome");
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return temp == rev;
	}
}
