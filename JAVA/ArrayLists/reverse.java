package ArrayLists;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class reverse 
{
    static void rev(ArrayList<Integer> l)
    {
        int i = 0;
        int j = l.size()-1;
        while (i<j)
        {
            Integer temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;  
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) 
        {
            int n = sc.nextInt();
            l.add(n);
        }
        System.out.println(l);
        // rev(l);
        Collections.reverse(l);
        System.out.println(l);
        sc.close();
    }   
}