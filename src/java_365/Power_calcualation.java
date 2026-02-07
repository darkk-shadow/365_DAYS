package java_365;

import java.util.*;

public class Power_calcualation {
	static Scanner sc = new Scanner(System.in);

	public static void power_calculation(int num, int power) {
		int res = 1;
		for (int i = 1; i <= power; i++) {
			res = res * num;
		}
		System.out.println(num + " to the power of " + power + " is equal to " + res);

	}

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.print("Enter the power : ");
		int power = sc.nextInt();
		power_calculation(num, power);
	}

}
