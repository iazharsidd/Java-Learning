package Stacks;

import java.util.Stack;

public class nextGreaterRevision 
{
    public static Stack<Integer> nextG(int[]arr)
    {
        Stack<Integer> st = new Stack<>();
        // Stack<Integer> g = new Stack<>();
        for (int i = 0; i < arr.length; i++) 
        {
            int j = i+1;
            while (j < arr.length && arr[i] > arr [j]) 
            {
                j++;
            }
            if (j < arr.length && arr[i] < arr[j]) 
            {
                st.push(arr[j]);
            }
            else
            {
                st.push(-1);
            }
        }
        return st;
    } 
    public static void main(String[] args) 
    {
        int[] arr = {1,3,2,1,8,6,3,4};
        System.out.println(nextG(arr));
        
    }
}
