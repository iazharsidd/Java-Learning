package Queues;

import java.util.*;

public class reverseWStack 
{
    public static void main(String[] args) {
        Queue<Integer> d = new LinkedList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        int n = d.size();
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < n; i++)
        {
           st.push(d.poll());
        }
        for (int i = 0; i < n; i++) 
        {
            d.add(st.pop());
        }
        System.out.println(d);      
    }   
}