package Sorting;

public class MergeSort 
{
    public static void merge(int[] arr,int l,int mid,int h)
    {
        int n = mid - l+1;
        int m = h - mid;
        int[] left = new int[n];
        int[] right = new int[m];
        int i,j,k;
        for(i = 0; i < n; i++) left[i] = arr[l+i];
        for(j = 0 ; j < m; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;
        while (i < n && j < m ) 
        {
            if (left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++]; 
        }
        while (i < n) 
        {
            arr[k++] = left[i++];
        }
        while (j < m) 
        {
            arr[k++] = right[j++];
        }
    }
    public static void mergeSort(int[] arr,int l, int h)
    {
        if (l == h) return;
        int mid = (l+h)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr,l,mid,h);
    }
    public static void main(String[] args) 
    {
        int[] arr = {9,3,7,5,6,4,8,2};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
