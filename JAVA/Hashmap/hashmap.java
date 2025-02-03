package Hashmap;

import java.util.HashSet;

public class hashmap 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("Size is "+set.size());
        System.out.println(set.contains(10));
        System.out.println(set);
        Object[] arr = set.toArray();
        for ( int i = 0; i < arr.length; i++)  
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}