package ArrayLists;

import java.util.ArrayList;

public class MaxWatertp
{
    public static int water(ArrayList<Integer> l)
    {
        int lp =0, rp= l.size()-1,max = 0;
        while (lp<rp)
        {
            int ht = Math.min(l.get(lp), l.get(rp));
            int width  = Math.abs(lp-rp);
            int  w = ht * width;
            max = Math.max(max, w);
            if (l.get(lp)<l.get(rp))
            {
                lp++; 
            }
            else
            {
                rp--;
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
