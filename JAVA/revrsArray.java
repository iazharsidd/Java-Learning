public class revrsArray 
{
    public static int[] inPReverse(int arr[])
    {
        int n = arr.length;
        int j = n-1;
        for (int i = 0; i < n/2; i++) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--; 
        }
        return arr;
    }
    public static int[] reverseA(int arr[])
    {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) 
        {
            rev[n-i-1] = arr[i];
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // int[] rev = reverseA(arr);
        // for (int i = 0; i < rev.length; i++) {
        //     System.out.print(rev[i]+" ");
        // }
        int rever[] = inPReverse(arr);
        for (int i = 0; i < rever.length; i++) 
        {
            System.out.print(rever[i]+" ");
        }
    }
}