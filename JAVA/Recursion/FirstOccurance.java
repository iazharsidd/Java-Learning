package Recursion;

import java.util.Scanner;

public class FirstOccurance 
{
    public static int firstOcc(int arr[],int i,int n)
    {
        if (i == arr.length) 
        {
            return -1;
        }
        if (n == arr[i])
        {
            return i;
        }
        return firstOcc(arr, i+1,n);
    }
    public static void main(String[] args) 
    {
       int a,n;
       System.out.print("Enter the size of array : ");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       int arr[] = new int[a];
       for (int i = 0; i < arr.length; i++) 
       {
         arr[i]=sc.nextInt();
       }
       System.out.print("Enter the Number : ");
       n = sc.nextInt();
       System.out.println(firstOcc(arr, 0, n));
       sc.close();   
    }
}