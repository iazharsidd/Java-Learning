package Recursion;

import java.util.Scanner;

public class FPairing 
{
    public static int pair(int n)
    {
        if (n == 1 || n==2)
        {
            return n;
        }
        return pair(n-1)+(n-1)*pair(n-2);
    }
    public static void main(String[] args) 
    {
        int n;
        System.out.print("Enter the number people : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(pair(n));
        sc.close();
    }
}