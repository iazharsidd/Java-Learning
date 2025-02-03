package ArrayLists;

import java.util.ArrayList;

public class pairsumRotated 
{
    public static boolean pairsum(ArrayList<Integer> l ,int k)
    {
        int bp = -1,n = l.size() ;
        for (int i = 0; i < l.size(); i++) 
        {
            if (l.get(i)>l.get(i+1)) 
            {
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while (lp!=rp)
        {
            if (l.get(lp)+l.get(rp)==k) 
            {
                return true;   
            }
            if (l.get(lp)+l.get(rp)<k)
            {
                lp = (lp+1)%n;
            }
            else
            {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        ArrayList <Integer> l = new ArrayList<>();
        l.add(11);
        l.add(15);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        int k = 16;
        System.out.println(pairsum(l, k));
    }
}
