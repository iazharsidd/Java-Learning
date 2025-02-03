package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
public class swap 
{
    public static void swapp(ArrayList<Integer> l,int idx1,int idx2)
    {
        int temp = l.get (idx1);
        l.set(idx1,l.get(idx2));
        l.set(idx2, temp);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int idx1,idx2;
        ArrayList <Integer> l = new ArrayList<>();
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(3);
        l.add(2);
        idx1 = sc.nextInt();
        idx2 = sc.nextInt();
        System.out.println(l);
        swapp(l, idx1, idx2);
        System.out.println(l);
        sc.close();
    }
    
}
