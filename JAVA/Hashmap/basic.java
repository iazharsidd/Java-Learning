package Hashmap;

import java.util.*;

public class basic 
{
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        //Adding Element
        mp.put("Azhar", 22);// updated in line 18
        mp.put("Mujeeb", 23);
        mp.put("Siddiqui", 24);
        mp.put("Azzu", 21);
        // Getting Value of the key from HM
        int m = mp.get("Azhar");//m = 22
        System.out.println(m);//22
        // Updating value of key
        mp.put("Azhar", 25);//update the key--->value if key already exist 
        System.out.println(mp);
        // removing a pair
        mp.remove("Azzu");//retunrns null if key does not exist
        System.out.println(mp);
        //check if the key exist in the map
        boolean c = mp.containsKey("Azhar");
        System.out.println(c);
        //put if the key does not exist
        if (!mp.containsKey("Azzu")) mp.put("Azzu", 21);
        mp.putIfAbsent("HP",630);
        System.out.println(mp);
        //Get All the keys in hashmap
        System.out.println(mp.keySet());
        //Get All the values in HM
        System.out.println(mp.values());
        //Get All the entries in hm
        System.out.println(mp.entrySet());
        for (String key : mp.keySet()) 
        {
            System.out.println("The key is ---> "+ key);
            System.out.println("The value of the key key is---> "+mp.get(key));
        }
        for (Map.Entry<String,Integer> e : mp.entrySet()) 
        {
            System.out.println("The key is -----> "+e.getKey());
            System.out.println("The Value is -----> "+e.getValue());
        }
        for (var e : mp.entrySet()) 
        {
            System.out.println(e.getValue());   
        }
    }
}