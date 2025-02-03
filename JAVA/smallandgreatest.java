public class smallandgreatest 
{
    public static int[] smallG(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) 
        {
            if (max < arr[i]) 
            {
                max = arr[i];
            }
            if (min > arr[i]) 
            {
                min = arr[i];
            }
        }
        int[] ans = new int[2];
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] arr = {3,6,4,2,8,1,9};// small 1 hai aur greatest 9
        int[] ans = smallG(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
