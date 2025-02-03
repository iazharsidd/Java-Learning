import java.util.Scanner;

public class waveprint2 
{
    public static void main(String[] args) 
    {
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of couloumns : ");
        c = sc.nextInt();
        int [][] arr = new int[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < c; j++) 
        {
            if (j%2==0)
            {
                for (int i = r-1; i >= 0; i--) 
                {
                    System.out.print(arr[i][j]+" ");                    
                }
            }
            else
            {
                for (int i = 0; i < r; i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }    
        sc.close();
    }
}