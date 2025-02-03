package Strings;

import java.util.*;

public class StrBuilder 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        st.append("hello");
        System.out.println(st);
        st.setCharAt(2, 'y');
        System.out.println(st);
        StringBuilder s = new StringBuilder(sc.nextLine());//taking input
        s.append(sc.nextLine());//input+input
        System.out.println(s);
    }
    
}
