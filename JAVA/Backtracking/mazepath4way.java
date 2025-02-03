package Backtracking;

import java.util.Scanner;

public class mazepath4way 
{
    public static int mazePath(int sr,int sc,int r,int c, boolean isVisited[][])
    {
        if (sr < 0 || sc < 0 || sr > r || sc > c ) 
        {
            return 0;
        }
        if (isVisited[sr][sc] == true) {
            return 0;
        }
        if (sr == r && sc == c )
        {
            return 1;
        }
        isVisited[sr][sc] = true;
        int rightWays = mazePath(sr, sc+1, r, c,isVisited);
        int leftWays = mazePath(sr, sc - 1, r, c,isVisited);
        int downWays = mazePath(sr+1, sc, r, c,isVisited);
        int upWays = mazePath(sr-1, sc, r, c,isVisited);
        isVisited[sr][sc] = false;
        int totalWays = rightWays + leftWays + downWays + upWays;
        return totalWays;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        boolean[][] isVisited = new boolean[r][c];
        System.out.println(mazePath(0,0,r-1,c-1,isVisited));
        sc.close();
    }
}    