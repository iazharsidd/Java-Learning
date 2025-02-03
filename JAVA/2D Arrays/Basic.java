// package 2D Arrays;

import java.util.Scanner;

public class Basic 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of coloumns : ");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) //arr.length = r
        {
            for (int j = 0; j < arr[i].length; j++) // arr[i].length = c
            {
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        sc.close();
    }
}