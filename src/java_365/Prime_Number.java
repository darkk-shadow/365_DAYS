package java_365;
import java.util.*;
//The Number Which Have only Two Factors Is known as prime Number
public class Prime_Number {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++) {       


			if(num%i==0 ) {

				count++;

			}

		}			

		if(count==0 && num>1) {
			System.out.println(num+" it is an primeNumber");
		}
		else {
			System.out.println(num+" it is not a PrimeNumber");
		}
	}
}
