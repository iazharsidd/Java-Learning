package Sorting;

import java.util.Scanner;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    flag = true;
                }
            }
            if (!flag) break;
        }
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}