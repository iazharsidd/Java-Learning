package Sorting;
public class quickSort 
{
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr,int l, int h)
    {
        int pivot = arr[l];
        int c = 0;
        for (int i = 0; i < h; i++) 
        {
            if (arr[i] <= pivot) c++;
        }
        int pi = l + c;
        swap(arr,l,pi);
        
        int i = l;
        int j = h;
        while (i < pi && j > pi) 
        {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pi && j > pi) 
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pi;
    }
    public static void quicksort(int[] arr,int l, int h)
    {
        if(l >= h) return;
         int pi = partition(arr,l,h);
         quicksort(arr, l, pi-1);
         quicksort(arr, pi+1, h);
    }
    public static void main(String[] args) 
    {
        int arr[] = {6,1,4,2,3,5};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
