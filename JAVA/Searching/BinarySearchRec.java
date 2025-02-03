package Searching;
public class BinarySearchRec 
{
    static int binarysearch(int[] arr, int l, int h, int t)
    {
        int mid = (l+h)/2;
        if (l > h) return -1;
        if (t == arr[mid]) return mid;
        else if (t < arr[mid]) return binarysearch(arr, l, mid-1, t);
        else return binarysearch(arr, mid+1, h, t);
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7};
        int t = 4;
        int idx = binarysearch(arr,0,arr.length-1,t);
        System.out.print(idx);
    }
}