package Stacks;

import java.util.*;

public class NextGreaterS 
{
    public static int[] nextGreatS(int[] arr)
    {
        int n = arr.length;
        Stack <Integer> st = new Stack<>();
        int[] r = new int[n];
        r[n-1] = -1;
        st.push(arr[n-1]);
        for (int i = n-2; i >= 0; i--) 
        {
            while (st.size()> 0 && st.peek() < arr[i]) 
            {
                st.pop();
            }
            if (st.isEmpty())
            {
                r[i] = -1;
            }
            else
            {
                r[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return r;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int a[] = nextGreatS(arr);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
