public class DiistributeChocolates 
{
    static boolean isDivided(int arr[],int n, int maxchoc)
    {
        int numOfStuts = 1;
        int choco = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxchoc) return false;
            if (choco + arr[i] <= maxchoc) 
            {
                choco += arr[i];
            }    
            else{
                numOfStuts++;
                choco = arr[i];
            }
        }
        return numOfStuts <= n;
    }
    static int distributechocos(int[] arr, int n)
    {
        if (arr.length < n) return -1;
        int ans = 0;
        int l = 1;
        int h = (int)1e9;
        while (l <= h) 
        {
            int mid = l+(h - l)/2;
            if (isDivided(arr,n,mid))
            {
                ans = mid;
                h = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr[] = {5,3,1,4,2};
        int n = 3;
        System.out.println(distributechocos(arr, n));
    }
}
