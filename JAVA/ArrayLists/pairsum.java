package ArrayLists;

import java.util.ArrayList;

public class pairsum {
    public static boolean psum(ArrayList<Integer> l, int k) {
        int lp = 0, rp = l.size() - 1;
        while (lp < rp) {
            if (l.get(rp) + l.get(lp) == k) {
                System.out.println(lp + " " + rp);
                return true;
            }
            if (l.get(lp)+l.get(rp)<k)
            {
                lp++;   
            }
            if (l.get(lp)+l.get(rp)>k)
            {
            rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        int k = 5;
        System.out.println(psum(l, k));
    }

}
