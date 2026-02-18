package java_365;

import java.util.*;

public class Fiboncci {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci series : ");

		for (int i = 0; i <= range; i++) {
			System.out.print(a + " ");

			int c = a + b;
			a = b;
			b = c;

		}
	}

}
