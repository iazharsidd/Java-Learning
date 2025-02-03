package Recursion;

import java.util.Scanner;

public class Frog 
{
    public static int best(int [] h,int n,int idx)
    {
        if (idx == n-1)
        {
            return 0;
        }
        int op1 = best(h, n, idx+1)+Math.abs(h[idx+1]-h[idx]);
        if (idx==n-2) 
        {
            return op1;
        }
        int op2 = best(h, n, idx+2)+Math.abs(h[idx+2]-h[idx]);
        return Math.min(op1, op2);
    }
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }System.out.println(best(arr, arr.length, 0));
        sc.close();
    }
}
