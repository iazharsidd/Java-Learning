import java.util.Scanner;

public class gcd
{
    public static void main(String[] args) 
    {
        int a,b,g=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        a = sc.nextInt();
        System.out.print("Enter the number b : ");
        b = sc.nextInt();
        int c = a;
        if (c<b)
        {
           c = b; 
        }
        for (int i = 1; i < c; i++) 
        {
           if (a%i==0 && b%i==0)
           {
            if (g<i) 
            {
                g = i;
            }
           } 
        }
         System.out.println(g);  
        sc.close();
    }
    
} 