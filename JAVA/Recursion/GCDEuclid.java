package Recursion;
import java.util.Scanner;
public class GCDEuclid 
{
    public static int gcdrec(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcdrec(b, a%b);
    }
    public static void main(String[] args) 
    {
          int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        a = sc.nextInt();
        System.out.print("Enter the number b : ");
        b = sc.nextInt();
         int g = gcdrec(a, b);
         System.out.println(g);
        sc.close();
    }   
}