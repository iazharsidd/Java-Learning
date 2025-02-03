package Stacks;

public class StockHighrev
{
    public static int[] Span (int[] arr)
    {
        int n = arr.length;
        // Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = n-1; i >= 0; i--) 
        {    
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int arr[] = { 100, 80, 60, 70, 60, 70, 85 };
        int res[] = Span(arr);
        for (int i = 0; i < res.length; i++) 
        {
            System.out.print(res[i] + " ");
        }
    }
}