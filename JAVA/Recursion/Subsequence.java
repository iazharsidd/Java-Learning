package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence 
{
    public static ArrayList <String> GetString(String st)
    {
        ArrayList <String> str = new ArrayList<>();
        if (st.length()== 0)
        {
            str.add("");
            return str;
        }
        char ch = st.charAt(0);
        ArrayList <String> s = GetString(st.substring(1));
        for (String ss : s) 
        {
            str.add(ss);
            str.add(ch + ss);
        }
        return str;
    }
    public static void main(String[] args) 
    {
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        st = sc.next();
        ArrayList <String> s = GetString(st);
        for (String string : s) 
        {
            System.out.println(string);
        }
        sc.close();
    }
}
