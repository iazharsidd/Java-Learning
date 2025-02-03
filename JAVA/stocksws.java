public class stocksws 
{
    public static int maxProfit(int[] arr)
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) 
            {
                int s = arr[j] - arr[i];
                max = Math.max(max, s);
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    
}
