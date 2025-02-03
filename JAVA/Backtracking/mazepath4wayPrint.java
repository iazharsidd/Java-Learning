package Backtracking;

import java.util.Scanner;

public class mazepath4wayPrint {
    public static void mazePath(int sr,int sc,int r,int c,boolean[][]isVisited,String s)
    {
        if (sr < 0 || sc < 0 || sr > r || sc > c ) 
        {
            return;
        }
        if (isVisited[sr][sc] == true)
        {
            return;
        }
        if (sr == r && sc == c) 
        {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //go right
        mazePath(sr, sc + 1, r, c, isVisited, s + "R");
        //go left
        mazePath(sr, sc - 1, r, c, isVisited, s + "L");
        //go down 
        mazePath(sr + 1, sc, r, c, isVisited, s + "D");
        //go up
        mazePath(sr - 1, sc, r, c, isVisited, s + "U");
        //backtracking
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        boolean[][] isVisited = new boolean[r][c];
        mazePath(0,0,r-1,c-1,isVisited,"");
        sc.close();
    }    
}
