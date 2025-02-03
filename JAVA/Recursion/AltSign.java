package Recursion;

import java.util.Scanner;

public class AltSign
{
    public static int AlterSign(int n)
    {
        if (n == 0)
        {
            return 0;   
        }
        if (n%2==0)
        {
            n = AlterSign(n-1)-n;
        }
        else
        {
            n = AlterSign(n-1)+n;
        }
        return n;
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int m = AlterSign(a);
        System.out.println(m);
        sc.close();
    }
}