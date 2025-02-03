package Sorting;

public class radixSort 
{
    static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    static void realCountSort(int[] arr,int place) 
    {
        int n = arr.length;
        int op[] = new int[n];
        int max = findMax(arr);
        int c[] = new int[10];
        for (int i : arr) {
            c[(i/place)%10]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = c[(arr[i]/place)%10] - 1;
            op[idx] = arr[i];
            c[(arr[i] / place) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = op[i];
        }
    }
    static void RadixSort(int[] arr)
    {
        int max = findMax(arr);
        for (int i = 1; max/i > 0 ; i*=10) 
        {
            realCountSort(arr,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {43,453,626,894,0,3};
        RadixSort(arr);
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
    }
}
