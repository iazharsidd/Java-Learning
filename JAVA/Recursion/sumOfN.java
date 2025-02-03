package Recursion;

import java.util.Scanner;

public class sumOfN 
{
    public static int sum(int a)
    {
        if(a==0)
        {
           return 0; 
        }
        return a+sum(a-1);
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the number : ");
        Scanner sc  = new Scanner(System.in);
        a = sc.nextInt();
        int s = sum(a);
        System.out.println("The sum is = "+s);
        sc.close();
    }
}