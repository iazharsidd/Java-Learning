package Sorting;
public class countSort 
{
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    static void basicCountSort(int[] arr) {
        int max = findMax(arr);// find max in the array
        // System.out.println(max);
        int[] c = new int[max+1];
        for (int i = 0; i < arr.length; i++) 
        {
            c[arr[i]]++;
        } 
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i]; j++) 
            {
                arr[k++] = i;
            }
        }
    }
    static void realCountSort(int[] arr)
    {
        int n = arr.length;
        int op[] = new int[n]; 
        int max = findMax(arr);
        int c[] = new int[max+1];
        for (int i : arr) 
        {
            c[i]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }
        for (int i = n-1; i >= 0; i--) 
        {
            int idx = c[arr[i]] - 1;
            op[idx] = arr[i];
            c[arr[i]]--;
        }
        for (int i = 0; i < n; i++) 
        {
            arr[i] = op[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 4, 5 };
        // basicCountSort(arr);
        realCountSort(arr);
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
    }
}
