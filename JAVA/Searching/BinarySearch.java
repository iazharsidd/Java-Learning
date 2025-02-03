package Searching;

public class BinarySearch 
{
    static int binarysearch(int[] arr,int t)
    {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int mid;
        while (l <= h) 
        {
            mid = (l + h) / 2;
            if (arr[mid] == t) return mid;
            else if (t < arr[mid]) h = mid - 1; 
            else l = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int t = 4;
        int idx = binarysearch(arr,t);
        System.out.print(idx);
    }
}
