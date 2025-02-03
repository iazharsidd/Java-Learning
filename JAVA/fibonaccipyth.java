import java.util.Scanner;

public class fibonaccipyth 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        while (z<=n) 
        {
            System.out.print(z + " ");
            x = y;
            y = z;
            z = x+y;
        }
        sc.close();
    }
    
}
