package Recursion;

import java.util.Scanner;

public class Increasing 
{
    public static void increasing(int n )
    {
        if(n==1|| n==0 )
        {
            System.out.println(n);
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        increasing(n);
        sc.close();
    }
}