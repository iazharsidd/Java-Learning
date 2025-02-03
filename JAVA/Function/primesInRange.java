import java.util.Scanner;

public class primesInRange 
{
    public static boolean prime( int m )
    {
        for (int i = 2; i <= Math.sqrt(m); i++) 
        {
            if (m%i==0) 
            {
              return false;    
            }
        }
        return true;
    }
    public static void inRange(int n)
    {
     for (int i = 2; i <=n; i++)
    {
    if(prime(i))
    System.out.print(i+" ");    
    }   
    }
    public static void main(String[] args) 
    {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        r = sc.nextInt();
        inRange(r);
        // System.out.println();
        sc.close();
    }
}
