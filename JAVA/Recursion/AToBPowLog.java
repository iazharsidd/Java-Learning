package Recursion;

import java.util.Scanner;

public class AToBPowLog 
{
    public static int power(int n,int p)
    {
        if (p == 0)
        {
         return 1;   
        }
        int r = power(n, p/2);
        if (p%2==0)
        {
         return r*r;
        }
        else
        return r*r*n; 
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
