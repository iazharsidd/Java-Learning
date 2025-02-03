package Sorting;
// import java.util.Scanner;
public class SelectionSort 
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the Array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.print("Enter the Array: ");
       
        // for (int i = 0; i < n; i++) {
        //     //arr[i] = sc.nextInt();
        // }   
        int[] arr = { 7, 5, 4, 1, 3 };
        int n = arr.length;
        //selection sort 
        for (int i = 0; i < n-1; i++) 
        {
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for (int j = i; j < n; j++) 
            {
                if (min > arr[j]) //finding min in every pass
                {
                    min = arr[j];
                    minidx = j;
                }
            }  
            System.out.println("min =" + min + " and idx " + min);
            //Swapping min with first index of the array(part of the array)
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }   
}