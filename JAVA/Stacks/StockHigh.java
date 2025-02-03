package Stacks;

import java.util.Stack;

public class StockHigh 
{
    public static int[] Span(int[] arr)
    {  
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) 
        {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) 
            {
            st.pop();
            }
            if (st.isEmpty()) 
            {
            res[i] = i + 1;
            }
            else 
            {
            res[i] = i - st.peek();
            }
            st.push(i);
        }
    return res;
}
    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 70, 85 };
        int res[] = Span(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
