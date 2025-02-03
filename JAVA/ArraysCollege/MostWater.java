public class MostWater 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) 
            {
                min = Math.min(arr[i], arr[j]);
                int area = min * (j - i);
                max = Math.max(max, area);
            }
        }
        System.out.println(max);
    }
}
