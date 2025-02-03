package Queues;
import java.util.*;
public class basic 
{
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        // Add elemnts in the queue 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();// will remove the first inserted element which is 1 in this case
        System.out.println(q);
        q.poll();// will remove the first inserted element which is 2 in this case because 1 is already removed
        System.out.println(q);
        int e = q.element();//will return the first (top) element in the queue which is 3  
        System.out.println(e);
        int f = q.peek();// will return the first (top) element in the queue which is 3
        System.out.println(f);
    }   
}
