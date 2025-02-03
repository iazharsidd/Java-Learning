import java.util.Scanner;

public class waveprint1 
{
    public static void main(String[] args) 
    {
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of coloumns : ");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) 
        {
            if (i%2==0) 
            {
                for (int j = 0; j < c; j++) 
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for (int j = c-1; j >=0 ; j--) 
                {
                System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
