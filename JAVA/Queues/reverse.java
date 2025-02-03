package Queues;

import java.util.*;

public class reverse 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("The queue is : "+q);
        int[] arr = new int[q.size()];
        for (int i = arr.length-1; i >= 0 ; i--) 
        {
            arr[i] = q.poll();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println(q);
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        System.out.println("The reversed queue is :  "+ q);
    }
}