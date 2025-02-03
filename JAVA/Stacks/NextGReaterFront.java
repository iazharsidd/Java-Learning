package Stacks;

import java.util.Stack;

public class NextGReaterFront 
{
    public static int[] GreaterFront(int[] arr)
    {
        int n = arr.length;
        Stack <Integer> st = new Stack<>();
        int[] res = new int[n];
        res[n-1]= -1;
        for (int i = 0; i < n-1; i++) 
        {
            int j = i+1;
            while(st.isEmpty() || st.peek() <= arr[i] && j< n) 
            {
                st.push(arr[j]);
                j++;
            }
            if (st.peek()> arr[i]) 
            {
                res[i] = st.peek();
            }
            else
            {
                res[i] = -1;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int res[] =  GreaterFront(arr); 
        for (int i = 0; i < res.length; i++) 
        {
            System.out.print(res[i]+" ");
        }
    }
}
