package Recursion;

import java.util.Scanner;

public class fibonacci 
{
    public static int fibo(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }        
       
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        int fn = fibo(n);
        System.out.println(fn);
        sc.close();
    }
}
