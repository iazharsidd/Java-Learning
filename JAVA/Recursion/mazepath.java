package Recursion;
import java.util.Scanner;

public class mazepath 
{
    public static int maze(int sr, int sc , int er , int ec)
    {
        if (sr > er || sc > ec  ) 
        {
            return 0;
        }
        if (sr == er && sc == ec) 
        {
            return 1;
        }
        int rightWays = maze(sr+1, sc, er, ec);
        int downWays = maze(sr, sc+1, er, ec);
        int totalWays = downWays+rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter thr number of coloumn : ");
        int c = sc.nextInt();
        int count = maze(1, 1, r, c);
        System.out.println(count);
        sc.close();
    }
}