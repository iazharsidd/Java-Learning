package Recursion;

import java.util.Scanner;

public class lastOccurance 
{
    public static int lastOcc(int arr[],int i,int n)
    {
        if (i == arr.length)
        {
            return -1;
        }
        int f = lastOcc(arr, i+1, n);
        if (f == -1 && arr[i]==n)
        {
            return i;
        }
        return f;
    }
    public static void main(String[] args) 
    {
        int a,n;
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        System.out.println(lastOcc(arr, 0, n));
        sc.close();
    }
}
