package java_365;
import java.util.*;
public class Palindrome {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		int rev = 0;
		for(;num!=0;num=num/10) {
			int digit=num%10;
			rev=rev*10+digit;
		}
		if(temp==rev) {
			System.out.print(temp+" is a Palindrome");
		}
		else {
			System.out.print(temp+" is not an Palindrome");
		}
	}

}
