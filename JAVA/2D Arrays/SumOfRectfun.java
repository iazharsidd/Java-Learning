import java.util.Scanner;

public class SumOfRectfun
{
    static void prefixSum(int [][] arr)
    {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) 
        {
            for (int j = 1; j < c; j++) 
            {
                arr[i][j]+=arr[i][j-1];   
            }
        } 
    }
    public static int findSum(int[][] arr,int l1,int l2,int b1,int b2 )
    {
        int sum = 0; 
        prefixSum(arr);
        for (int i = l1; i <= l2; i++) 
        {
            if (b1>=1) 
            {
                    sum+=arr[i][b2]- arr[i][b1-1];
            }
            else
            sum+=arr[i][b2];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int r,c,l1,l2,b1,b2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of coulumns : ");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter starting row  : ");
        l1 = sc.nextInt();
        System.out.print("Enter endin row : ");
        l2 = sc.nextInt();
        System.out.print("Enter the staring coloumn : ");
        b1 = sc.nextInt();
        System.out.print("Enter ending coloumn : ");
        b2 = sc.nextInt();
        System.out.println(findSum(arr, l1, l2, b1, b2));
        sc.close();
    }
}