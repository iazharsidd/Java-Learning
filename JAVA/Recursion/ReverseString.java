package Recursion;

import java.util.Scanner;

public class ReverseString 
{
    public static void revSt(String st,int idx)
    {
        if (idx>=st.length()) 
        {
            return;
        }
        revSt(st, idx+1);
        System.out.print(st.charAt(idx)+" ");
    }
    public static void main(String[] args)
    {
        String st;
        Scanner sc = new Scanner(System.in);
        st = sc.next();
        revSt(st, 0);
        sc.close();
    }
    
}
