package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class insertingAtAnyIndex 
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
        System.out.print("Enter the index : ");
        int i = sc.nextInt();
        System.out.print("Enter the Element : ");
        int e = sc.nextInt();
        Stack<Integer> t = new Stack<>();//naya stack jismein purana wala khali kiya jayega 
        while (st.size()>i) //index tak loop chalega aur zero based indexing hai
        {
            t.push(st.pop());
        }
        st.push(e);
        while (t.size()>0) 
        {
            st.push(t.pop());
        }
        System.out.println(st);
        sc.close();
    }    
}
