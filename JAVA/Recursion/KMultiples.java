package Recursion;

import java.util.Scanner;

public class KMultiples 
{
    public static void mul(int a,int k)
    {
        if (k == 0)
        {
            return;   
        }
        mul(a, k-1);
        System.out.print(a*k + " ");
        return ;
        }
    public static void main(String[] args) 
    { 
        int a;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner (System.in);
        a =sc.nextInt();
        System.out.print("Enter the number of Mutiple : ");
        int k = sc.nextInt();
        mul(a, k);
        sc.close();
    }
}