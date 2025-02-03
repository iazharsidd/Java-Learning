package Recursion;

import java.util.Scanner;

public class HCF 
{
    public static int gcd (int a,int b)
    {
        if (b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) 
    {
         int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        a = sc.nextInt();
        System.out.print("Enter the number b : ");
        b = sc.nextInt();
         int g = gcd(a, b);
         System.out.println(g);
        sc.close();
    }
}