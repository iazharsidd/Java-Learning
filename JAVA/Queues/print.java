package Queues;

import java.util.*;

public class print 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        for (int i = 0; i < q.size(); i++) 
        {
          int r = q.poll();
          System.out.print(r+" ");
          q.add(r);
          System.out.println(q);
        }
    }
}