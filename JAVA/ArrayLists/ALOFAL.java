package ArrayLists;

import java.util.ArrayList;

public class ALOFAL 
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> l = new ArrayList<>();
        // l.add(1);
        // l.add(2);
        // mainList.add(l);
        // System.out.println(mainList);
        // ArrayList <Integer> l2 = new ArrayList<>();
        // l2.add(4);
        // l2.add(6);
        // l2.add(5);
        // mainList.add(l2);
        // System.out.println(mainList);
        // for (int i = 0; i < mainList.size(); i++)
        // {
        //     ArrayList <Integer> c = mainList.get(i);
        //     for (int j = 0; j < c.size(); j++) 
        //     {
        //         System.out.print(c.get(j)+" ");
        //     } 
        //     System.out.println();
        // }
        ArrayList<Integer> l = new ArrayList<>(); 
        ArrayList<Integer> l1 = new ArrayList<>(); 
        ArrayList<Integer> l2= new ArrayList<>(); 
        for (int i = 1; i < 5; i++)
        {
            l.add(i*1);   
            l1.add(i*2);   
            l2.add(i*3);   
        }
        mainList.add(l);
        mainList.add(l1);
        mainList.add(l2);
        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++)
        {
            ArrayList<Integer> c = mainList.get(i);
            for (int j = 0; j < c.size(); j++) 
            {
                System.out.print(c.get(j)+" ");
            }
            System.out.println();
        }
    }
}