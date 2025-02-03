package Recursion;

import java.util.Scanner;

public class LinearSearch 
{
    public static int  LS(int[] arr,int idx,int k)
    {
        if(idx >= arr.length)
        {
            return -1;
        }
        if (arr[idx]==k)
        {
        return idx;
        }
        return LS(arr, idx+1, k);
    }
    public static void main(String[] args) 
    {
        int a,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        k = sc.nextInt();
        int idx = LS(arr, 0,k);
        System.out.println(idx);     
        

        sc.close();     
    }
}
