package Recursion;

import java.util.Scanner;

public class Tiling
{
     public static int tile(int b)
     {
        if (b == 0 || b == 1)
        {
            return 1;
        }
        // int v = tile(b - 1);// vertical
        // int h = tile(b - 2);// horizontal
        // int t = v + h;
        // return t;
        return tile(b-1)+tile(b-2);
     }
    public static void main(String[] args) 
    {
      int b;
      System.out.print("Enter the breadth of he floor : ");
      Scanner sc = new Scanner(System.in);
      b = sc.nextInt();
      System.out.println(tile(b));
      sc.close();
    }   
}
