package java_365;

import java.util.Scanner;

class Abundant_Deficient {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;   
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number");
        }
        else if (num > sum) {
            System.out.println(num + " is a Deficient Number");
            System.out.println("Deficient Value = " + (num - sum));
        }
        else {
            System.out.println(num + " is an Abundant Number");
            System.out.println("Abundant Value = " + (sum - num));
        }
    }
}
