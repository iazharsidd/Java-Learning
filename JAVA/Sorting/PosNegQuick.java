package Sorting;

public class PosNegQuick 
{
    static void segregate(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i < j) 
        {
            if (arr[i] > 0 && arr[j] < 0) 
            {
                int temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[j] > 0 ) j--;
            else if(arr[i] < 0 ) i++;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        segregate(arr);
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
    }
    
}
