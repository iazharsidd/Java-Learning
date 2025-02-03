package Sorting;

public class SwapSorted
{
    static void sortFix(int[] arr)
    {
        int n = arr.length;
        int a = 0;
        int b = 0;
        int i = 0;
        int j = n-1;
        while (i <  j) 
        {
            if (arr[i] > arr[i+1])
            {
                a = i;
                i++;
            }
            else i++;
            if (arr[j] < arr[j-1])
            {
                b = j;
                j--;
            }
            else j--;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) 
    {
        int[] arr = {3};
        sortFix(arr);
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
        
    }
}
