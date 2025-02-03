package Recursion;

import java.util.Scanner;

public class Arrayprint 
{
    public static void AP(int[] arr,int idx)
    {
        if (idx == arr.length-1)
        {
            System.out.println(arr[idx]);
            return ;
        }
        System.out.print(arr[idx]+" ");
        AP(arr, idx+1);
    }
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        AP(arr,0);
        sc.close();
    }
}
