package java_365;
import java.util.*;
public class PrimeNumbersBetweenRange {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the starting range : ");
		int start=sc.nextInt();
		System.out.print("Enter the ending range : ");
		int end=sc.nextInt();	
		System.out.println("The Prime numbers are : ");

		int sum=0;
		long mul=1;

		for(int i=start;i<=end;i++) {
			int count=0;

			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}

			if(count==0 && i>1) {
				System.out.print(i+" ");
				sum+=i;
				mul*=i;
				
			}
			
		}
		System.out.println();
		System.out.println("The sum of prime numbers in the given range is: "+sum);
		System.out.println("The product of prime numbers in the given range is: " +mul);


	}



}
