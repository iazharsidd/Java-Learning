package Backtracking;

import java.util.Scanner;

public class mazepath2way 
{
    public static void mazePrint(int r, int c, int sr,int sc,String s)
    {
        if (sr > r || sc > c) 
        {
            return;
        }
        if (sr == r && sc == c) 
        {
            System.out.println(s);
            return;
        }
        mazePrint(r, c, sr, sc + 1, s+"R");
        mazePrint(r, c, sr+1, sc,s+"D");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of coloums: ");
        int c = sc.nextInt();
        mazePrint(r, c, 1, 1, "");
        sc.close();
    }
}
