package Recursion;

import java.util.Scanner;

public class FindIndex 
{
    public static void findI(int arr[],int idx,int x)
    {
        if (idx>=arr.length)
        {
            return;
        }
        if (arr[idx]==x)
        {
            System.out.print(idx+" ");
        }
        findI(arr, idx+1, x);
    }
    public static void main(String[] args) 
    {
        int a,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x = ");
        x = sc.nextInt();
        findI(arr, 0, x);
        sc.close();
    }
}
