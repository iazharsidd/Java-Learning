import java.util.Scanner;

public class SumOfRect 
{
    public static void main(String[] args) 
    {
        int r,c,l1,l2,b1,b2,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns : ");     
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter starting row  : ");
        l1 = sc.nextInt();
        System.out.print("Enter endin row : ");
        l2 = sc.nextInt();
        System.out.print("Enter the staring coloumn : ");
        b1= sc.nextInt();
        System.out.print("Enter ending coloumn : ");
        b2 = sc.nextInt();
        for (int i = l1; i <= l2; i++) 
        {
            for (int j = b1; j <= b2; j++) 
            {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}