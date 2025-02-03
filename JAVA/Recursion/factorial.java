package Recursion;
import java.util.Scanner;

public class factorial 
{
    public static int fact( int a)
    {
        if (a == 0 || a == 1) 
        {
            return 1;
        }
        return a*fact(a-1);
    }
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        int f = fact(a);
        System.out.println(f);
        sc.close();
    }
}