// package 2D Arrays;

import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args) 
    {
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter th number of coloumns : ");
        c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter Array 1 : ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] brr = new int[r][c];
        System.out.println("Enter Array 2 : ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                brr[i][j] = sc.nextInt();
            }
        }
        int [][] s = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
              s[i][j]= arr[i][j]+brr[i][j];   
            }
        }
         for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
             System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}