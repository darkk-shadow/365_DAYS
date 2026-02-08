package java_365;
import java.*;
import java.util.Scanner;
public class Simple_Calculator {
static Scanner sc =new Scanner(System.in);
	    static int choice;
	    public static void main(String[] args) {

	        System.out.println("\t\tCALCULATOR");

	        do {
	            System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
	            System.out.print("Enter Your Choice : ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Addition : " + operation());
	                    break;

	                case 2:
	                    System.out.println("Subtraction : " + operation());
	                    break;

	                case 3:
	                    System.out.println("Multiplication : " + operation());
	                    break;

	                case 4:
	                    System.out.println("Division : " + operation());
	                    break;

	                case 5:
	                    System.out.println("\t\tThank You");
	                    break;

	                default:
	                    System.out.println("Enter a valid Choice...");
	            }
	        } while (choice != 5);
	    }

	    public static int operation() {
	        System.out.print("Enter 1st Number : ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter 2nd Number : ");
	        int num2 = sc.nextInt();

	        if (choice == 1)
	            return num1 + num2;
	        else if (choice == 2)
	            return num1 - num2;
	        else if (choice == 3)
	            return num1 * num2;
	        else if (choice == 4) {
	            if (num2 == 0) {
	                System.out.println("Cannot divide by zero!");
	                return 0;
	            }
	            return num1 / num2;
	        } else
	            return 0;
	    }
	}



