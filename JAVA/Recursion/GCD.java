package Recursion;
import java.util.Scanner;
public class GCD
{
public static int gcdd(int a,int b)
{
     while (a%b!=0)
        {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
}
    public static void main(String[] args) 
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        a = sc.nextInt();
        System.out.print("Enter the number b : ");
        b = sc.nextInt();
         int g = gcdd(a, b);
         System.out.println(g);
        sc.close();
    }
}