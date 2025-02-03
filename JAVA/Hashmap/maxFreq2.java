package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class maxFreq2 
{
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer> freq = new HashMap<>();
        for (int i : arr) 
        {
            if (!freq.containsKey(i)) 
            {
                freq.put(i, 1);
            }
            else{
                freq.put(i, freq.get(i)+1);
            }
        }
        System.out.println(freq.entrySet());
        int max = 0;
        int ansk = -1;
        // for (var i : freq.entrySet()) 
        // {
        //     if (i.getValue() > max) 
        //     {
        //         max = i.getValue();
        //         ansk = i.getKey();
        //     }
        // }
        // System.out.println(ansk+" "+max);
        // 1,4,2,5,1,4,4,6,4,4,4
        for (var i : freq.keySet()) 
        {
            if (freq.get(i) > max) 
            {
                max = freq.get(i);
                ansk = i;
            }
        }
        System.out.println(ansk+" "+max);
    }
}
