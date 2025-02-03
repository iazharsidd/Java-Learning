public class prefixSum 
{
    public static int[] suffix(int [] arr)
    {
        int n = arr.length;
        int[] suf = new int[n];
        suf[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) 
        {
            suf[i] = arr[i] + suf[i+1];
        } 
        return suf;
    }
    public static int[] prefix(int[] arr)
    {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) 
        {
            pre[i] = arr[i] + pre [i-1];
        } 
        return pre;
    }
    public static void main(String[] args) 
    {
        int[] arr ={1,2,3,4,5};
        int[] pre = prefix(arr);
        for (int i = 0; i < pre.length; i++) {
            System.out.print(pre[i]+" ");
        }
        System.out.println();
        int[] suf = suffix(arr);
        for (int i = 0; i < suf.length; i++) {
            System.out.print(suf[i] + " ");
        }
    }
}