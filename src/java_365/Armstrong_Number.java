package java_365;
import java.util.*;
public class Armstrong_Number {
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static int  count_digit(int num ) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static int calculate_power(int num,int power) {
		int res=1;
		for(int i=1;i<=power;i++) {
			res*=num;
		}
		
		return res;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		int temp=num;
		int count=count_digit(num);
		int sum=0;
		for (; num != 0; num = num / 10) {
            int digit = num % 10;
            sum += calculate_power(digit, count); 
        }

		if(temp==sum) {
			System.out.println(temp+" is an Armstrong number");
		}
		else {
			System.out.println(temp +" is not an Armstrong number ");
		}
		

}}
