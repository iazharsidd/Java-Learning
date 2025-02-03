import java.util.Scanner;

public class leftHalfpyramidstar 
{
    public static void main(String[] args)
    {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        for (int i = 1; i <= r; i++) 
        {
            for (int j = 1; j <=r-i ; j++) 
            {            
               System.out.print(" ");
            }
            for (int j = 1; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
