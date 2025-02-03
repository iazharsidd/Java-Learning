package Sorting;

public class InsertionSort 
{
    public static void main(String[] args) 
    {
        int[] arr = { 7, 5, 4, 1, 3 };
        int n = arr.length;
        for (int i = 1; i < n; i++) 
        {
            int j = i;
            while (j > 0 && arr[j]<arr[j-1] ) 
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }   
}