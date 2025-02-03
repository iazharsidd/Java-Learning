package Backtracking;

import java.util.Scanner;

public class RatInADeadMaze4WayOptimized 
{
    public static void mazePath(int sr,int sc,int r,int c,String s,int [][] maze)
    {
        if (sr < 0 || sc < 0 || sr > r || sc > c) 
        {
            return;
        }
        if (maze[sr][sc] == -1) 
        {
            return;
        }
        if (maze[sr][sc]==0) 
        {
            return;
        }
        if (sr == r && sc == c) 
        {
            System.out.println(s);
            return;
        }
        maze[sr][sc] = -1;
        //go right
        mazePath(sr, sc+1, r, c, s+"R", maze);
        //go Left
        mazePath(sr, sc-1, r, c, s+"L", maze);
        //go down
        mazePath(sr+1, sc, r, c, s+"D", maze);
        //go UP
        mazePath(sr-1, sc, r, c, s+"U", maze);
        maze[sr][sc] = 1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] maze = {{1 , 0 , 0 },
                        {1 , 1 , 1 },
                        {1 , 1 , 1 }};
        mazePath(0,0,r-1,c-1,"",maze);
        sc.close();
    }
}
