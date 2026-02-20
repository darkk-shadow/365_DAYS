package java_365;

import java.util.*;

/*   *****LOGIC******
Step 1:
Take a number.

Step 2:
Find the sum of its digits.

Step 3:
If the sum has more than one digit,
again find the sum of digits of that sum.

Step 4:
Repeat this process until you get a single digit.

Step 5:
If the final single digit is 1 → Magic Number
Otherwise → Not a Magic Number.
*/

public class MagicNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp=num;

		while (num > 9) {
			int sum = 0;

			while (num != 0) {
				int dig = num % 10;
				sum = sum + dig;
				num = num / 10;
			}

			num = sum;
		}

		if (num == 1) {
			System.out.println(temp+" is an Magic Number");
		} else {
			System.out.println(temp+" Not an Magic Number");
		}
	}
}