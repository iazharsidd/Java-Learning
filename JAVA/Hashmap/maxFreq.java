package Hashmap;

import java.util.*;

public class maxFreq 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,1,1,2,2,2,2,3,3,4,5,5,5,6,6,6,6};
        Map<Integer , Integer> f = new HashMap<>();
        for (int i : arr) 
        {
            if (!f.containsKey(i)) f.put(i, 1);
            else f.put(i, f.get(i)+1);
        }
        System.out.println(f.entrySet());
        int m = Integer.MIN_VALUE;
        int n = 0;
        // for (var i : f.entrySet()) 
        // {
        //     if (i.getValue() > m) 
        //     {
        //         m = i.getValue();
        //         n = i.getKey();
        //     }
        // }
        // System.out.printf("The most frequent Key is %d and frequency is %d",n,m);
        for (int i : f.keySet()) 
        {
            if (f.get(i) > m)
            {
                m = f.get(i);
                n = i;
            }
        }
        System.out.printf("The most frequent Key is %d and frequency is %d", n, m);
    }   
}