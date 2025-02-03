import java.util.Scanner;

public class BinomialCoefficient 
{
    public static int fact(int f)
    {
        int a = 1;
        if (f==1||f==0)
        {
         return 1;   
        }
        else
        {
            for (int i = 1; i <=f; i++)
            {
                a=a*i;
            }
            return a;
        }
    }
    public static void main(String[] args) {
        int n,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r respectively : ");
        n=sc.nextInt();
        r=sc.nextInt();
        int nCr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
        sc.close(); 
    }
}
