import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line : ");
        n=sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
