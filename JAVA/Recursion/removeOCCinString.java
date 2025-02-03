package Recursion;

import java.util.Scanner;

public class removeOCCinString 
{
    public static String rc(String st,int idx, char ch)
    {
        if (idx==st.length())
        {
            return "";
        }
        if (st.charAt(idx)==ch)
        {
           return rc(st,idx+1,ch);
        }
        else
        {
            return st.charAt(idx) + rc(st, idx + 1, ch);
        }
    }
 public static void main(String[] args)
 {
    String st;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String : ");
    st = sc.next();
    System.out.print("Enter the Character to remove : ");
    char x = sc.next().charAt(0);
    String str =  rc(st,0,x);
    System.out.println(str);
    sc.close();
 }
}
