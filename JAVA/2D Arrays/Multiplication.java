import java.util.Scanner;

public class Multiplication 
{
    public static void main(String[] args)
    {
        int r,c,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of first matrix : ");
        r = sc.nextInt();
        System.out.print("Enter the number of coloumns of first matrix : ");
        c = sc.nextInt();
         System.out.print("Enter the number of rows of second matrix : ");
        a = sc.nextInt();
        System.out.print("Enter the number of coloumns of second matrix : ");
        b = sc.nextInt();
        if (c==a)
        {
            int[][] arr = new int[r][c];
            System.out.println("Enter first matrix ");
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            int[][] brr = new int[a][b];
            System.out.println("Enter second matrix ");
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j < b; j++) 
                {
                    brr[i][j]=sc.nextInt();
                }
            }
              int[][] res = new int[r][b];
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < b; j++)
                {
                  res[i][j]=0;
                    for (int k = 0; k < c; k++) 
                    {
                        res[i][j] += arr[i][k]*brr[k][j];
                    }
                }
            }
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < b; j++) 
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
         System.out.println("invalid matrix");
         sc.close();
    }
}
