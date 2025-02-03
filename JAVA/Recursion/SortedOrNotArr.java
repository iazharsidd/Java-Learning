package Recursion;

import java.util.Scanner;

public class SortedOrNotArr 
{
    public static boolean isSorrted(int arr[],int i)
    {
        if( i==arr.length-1 )
        {
            return true;
        }
        if (arr[i]>arr[i+1])
        {
          return false;  
        }
        return isSorrted(arr, i+1);  
    }
    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();            
        }
        System.out.println(isSorrted(arr,0));
        sc.close();
    }
}