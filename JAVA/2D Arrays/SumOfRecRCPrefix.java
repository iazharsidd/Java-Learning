import java.util.Scanner;

public class SumOfRecRCPrefix 
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
        for (int j = 0; j < c; j++) 
        {
            for (int i = 1; i < r; i++) 
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
    }
    public static int findSum(int[][] arr,int l1,int l2,int b1,int b2 )
    {
        int ans = 0; 
        prefixSum(arr);
        int sum = 0,up = 0,left = 0,leftup = 0;
        sum = arr[l2][b2];
        if(b1>=1)
        left = arr[l2][b1-1];
        if(l1>=1)
        up = arr[l1-1][b2];
        if(l1>1&&b1>1)
        leftup = arr[l1-1][b1-1];
        ans = sum - up  - left +leftup;
        return ans;
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
