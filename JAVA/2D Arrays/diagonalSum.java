import java.util.Scanner;

public class diagonalSum 
{
    public static void main(String[] args) 
    {
        int n,ld=0,rd=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimention of the matrix : ");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                arr[i][j] = sc.nextInt();                
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                if (i == j)
                {
                    ld+=arr[i][j];
                }
                if (i+j==n-1) 
                {
                    rd+=arr[i][j];
                }
            }
        }
        System.out.println("left diagonal is : "+ld );
        System.out.println("right diagonal is : "+rd );
        sc.close();
    }
}