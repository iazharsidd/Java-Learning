package Queues;

import java.util.*;

public class revK 
{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n = q.size();
        int k = 3;
        for (int i = 0; i < k; i++) 
        {
            st.push(q.remove());
        }
        System.out.println(q);
        System.out.println(st);
        while (st.size()>0) 
        {
            q.add(st.pop());
        }
        System.out.println(q);
        System.out.println(st);
        for (int i = 0; i < n-k; i++)
        {
            q.add(q.remove());
        }
        System.out.println(q);
    }
    
}
