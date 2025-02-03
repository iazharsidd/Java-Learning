package Backtracking;

import java.util.Scanner;

public class RatInADeadMaze2way 
{
    public static void mazePath(int sr, int sc, int r, int c,int isVisited[][],String s)
    {
        if (sr < 0 || sc < 0 || sr > r || sc > c) 
        {
            return;
        }
        if (isVisited[sr][sc] == 0) 
        {
            return;
        }
        if (sr == r && sc == c) 
        {
            System.out.println(s);
            return;
        }
        // go right
        mazePath(sr, sc + 1, r, c, isVisited, s + "R");
        // go down
        mazePath(sr + 1, sc, r, c, isVisited, s + "D");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] isVisited = { {1 , 0 , 1 },
                              {1 , 1 , 0 },
                              {1 , 1 , 1 }

        };
        mazePath(0,0,r-1,c-1,isVisited,"");
        sc.close();
    }
    
}
