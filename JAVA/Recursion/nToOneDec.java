package Recursion;

import java.util.Scanner;

public class nToOneDec
{
    public static void decreasing(int a)
    {
        if (a==0) 
        {
         return ;  
        } 
        System.out.print(a+" ");
        decreasing(a-1);
        return;
    }
   public static void main(String[] args) 
   {
    int a;
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    a= sc.nextInt();
    decreasing(a);
    sc.close();
   } 
}
