package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStringInDecending 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            int a = sc.nextInt();
            l.add(a);    
        }
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);
        ArrayList <String> st = new ArrayList<>();
        st.add("Azhar");
        st.add("Mujeeb");
        st.add("Siddiqui");
        Collections.sort(st,Collections.reverseOrder());
        System.out.println(st);
        sc.close();
    }
    
}
