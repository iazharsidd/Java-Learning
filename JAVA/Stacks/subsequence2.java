package Stacks;
import java.util.Stack;

public class subsequence2 
{
    public static Stack<Integer> subs(int[] arr)
    {
        int n = arr.length;
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) 
        {
            if(st.isEmpty())
            {
                st.push(arr[i]);
            }
            else if (i > 0 && i < n) 
            {
                if ((i < n-1) && (arr[i - 1] == arr[i] || arr[i] == arr[i + 1]))
                {
                continue;
                }
                st.push(arr[i]);
            }
        }
        return st;
    }
    public static void main(String[] args) {
    int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
    System.out.println(subs(arr));
    }
}