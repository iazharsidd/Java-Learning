package ArrayLists;

import java.util.ArrayList;

public class MaxWater 
{
    public static int water(ArrayList<Integer> l )
    {
        int w = 0,max = 0;
        for (int i = 0; i < l.size(); i++)
        {
            for (int j = i+1; j < l.size(); j++) 
            {
                int ht = Math.min(l.get(i), l.get(j));
                int width = Math.abs(l.get(i)-l.get(j));
                w= ht*width;
            }
            if (w>max)
            {
                max = w;   
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        ArrayList <Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
       int w = water(l);
        System.out.println(w);
    }
    
}