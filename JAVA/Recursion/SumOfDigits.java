package Recursion;

import java.util.Scanner;

public class SumOfDigits 
{
    public static int sum(int a)
    {
        if (a == 0)
        {
            return 0;
        }
        int l = a%10;
        return l+sum(a/10);
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(sum(a));
        sc.close();
    }
}
