package Stacks;

import java.util.*;
public class insertingAtBottom 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemnts : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        Stack <Integer> st = new Stack<>();
        for (int i = 1; i <= n; i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack <Integer> gt = new Stack<>();
        while (st.size()>0) 
        {
            gt.push(st.pop());
        }
        System.out.println(gt);
        System.out.print("Enter the element to be inserted : ");
        int e = sc.nextInt();
        st.push(e);
        while (gt.size()>0)
        {
            st.push(gt.pop());
        }
        System.out.print("Stack after inserting -> ");
        System.out.println(st);
        sc.close();
    }
}
