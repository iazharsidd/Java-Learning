package ArrayLists;

import java.util.ArrayList;

public class Basics 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> l = new ArrayList<>();
        for (int i = 1; i <= 10; i++) 
        {
            l.add(i);   
        }
        System.out.println(l);//to print the list directly
        System.out.println("size of list "+l.size());
        for (int i = 0; i < l.size(); i++)
        {
            System.out.print(l.get(i)+" ");   //to print the list through loop
        }
        System.out.println();
        l.add(1, 100);//add element at any index
        System.out.println(l);
        System.out.println("Size of list "+l.size());
        l.set(1, 10);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.remove(Integer.valueOf(2));
        System.out.println(l);
        boolean ans = l.contains(Integer.valueOf(100));
        System.out.println(ans);
        // ArrayList list = new ArrayList();
        // list.add("Azhar");
        // list.add(23);
        // list.add('s');
        // System.out.println(list);

    }
    
}
