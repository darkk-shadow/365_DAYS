package java_365;
import java.util.*;
class Strong_Number
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        identifyStrongNumber(num);
    }

    public static void identifyStrongNumber(int num)
    {
        int sum = 0;
        int temp = num;

        while (num != 0)
        {
            int digit = num % 10;
            sum += getFactorial(digit);  
            num = num / 10;
        }

        if (temp == sum)
        {
            System.out.println(temp + " is a Strong Number");
        }
        else
        {
            System.out.println(temp + " is not a Strong Number");
        }
    }

    public static int getFactorial(int num)
    {
        int fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }
}
