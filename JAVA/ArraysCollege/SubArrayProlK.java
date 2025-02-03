public class SubArrayProlK 
{
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int n = arr.length; 
        int c = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j++) 
            {
                int sum = 1;
                for (int k = i; k <= j; k++) 
                {
                    sum *= arr[k];
                }
                if (sum < 100)
                    c++;
            }
        }
        System.out.println(c);
    }
}
