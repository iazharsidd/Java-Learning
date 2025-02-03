package Stacks;

import java.util.*;
public class nextGreaterElement 
{
    public static Stack<Integer> Greater(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;//8
        for (int i = 0; i < n; i++) 
        { 
            st.push(-1);
            for (int j = i+1; j < n; j++) 
            {
                if (arr[i]<arr[j])
                {   
                    st.pop();
                    st.push(arr[j]);
                    break;
                }
            }
        }
        return st;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array : ");
        int [] arr = new int[8];
        for (int index = 0; index < arr.length; index++) 
        {
            arr[index] = sc.nextInt();
        }
        System.out.println(Greater(arr));
        sc.close();
    }
}