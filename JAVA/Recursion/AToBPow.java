package Recursion;

import java.util.Scanner;

public class AToBPow 
{
    public static int power(int n,int p)
    { 
        if (p == 0) 
        {
            return 1;
        }
        return n*power(n, p-1);
    }
    public static void main(String[] args) 
    {
        int n,p;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         System.out.print("Enter the power : ");
        p = sc.nextInt();
        int r = power(n,p);
        System.out.println(r);
        sc.close();
    }
}
