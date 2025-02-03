package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class move 
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
        Stack <Integer> wt = new Stack<>(); 
        while (st.size()>0) 
        {
            int x = st.peek();
            wt.push(x);
            st.pop();
        }
        System.out.println("Elemnts of Stack st :"+st);
        System.out.println("Elements of stack wt : "+wt);
        //Another way
        while (st.size()>0) 
        {
            wt.push(st.pop());//popped element of stack st will be pushed directly in stack wt 
        }
        System.out.println("Elemnts of Stack st : "+st);
        System.out.println("Elements of stack wt : "+wt);
        //Moving in Another Stack 
        Stack <Integer> rt = new Stack<>();
        while (wt.size()>0) 
        {
            rt.push(wt.pop());
        }
        System.out.println("Elemnts of Stack st : "+st);
        System.out.println("Elements of stack wt : "+wt);
        System.out.println("Elements of stack rt : "+rt);
        sc.close();
    }
}
