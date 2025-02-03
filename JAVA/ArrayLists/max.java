package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class max
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) 
        {
            int n = sc.nextInt();
            l.add(n);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l.size(); i++) {
        //     if (max < l.get(i))
        //     {
        //         max = l.get(i);
        //     }
            max = Math.max(max, l.get(i));
        }
        System.out.println(max);
        sc.close();
    }
}