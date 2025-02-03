package Recursion;

import java.util.Scanner;

public class SumofSubset 
{
    public static void sum(int[] arr,int n,int idx,int sum)
    {
        if (idx>=n)
        {
            System.out.println(sum);
            return;
        }
        sum(arr, n, idx+1, sum+arr[idx]);
        sum(arr, n, idx+1, sum);
    }
    public static void main(String[] args) 
    {
        int a; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        sum(arr, arr.length, 0, 0);
        sc.close();
    }
}