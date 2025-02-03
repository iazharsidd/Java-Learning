public class findSmallestinRotatedArray 
{
    static int findMin(int[] nums)
    {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans = 0;
        while (l <= h) 
        {
            int mid = l+(h-l)/2;
            if (nums[mid] <= nums[n-1]) 
            {
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2,3};
        int idx = findMin(nums);
        System.out.println(idx);
    }
}
