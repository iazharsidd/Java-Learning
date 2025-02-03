package Recursion;

import java.util.Scanner;

public class PalindromeString 
{
    public static String palindrome(String st,int idx)
    {
        if (idx>=st.length())
        {
            return "";
        }
        return st.charAt(idx)+ palindrome(st, idx+1);
    }
    public static boolean isPalindrome(String st,int l,int r)
    {
        if (l>=r)
        {
            return true;
        }
        return(st.charAt(l)== st.charAt(r)&&isPalindrome(st, l+1, r-1));
    }
    public static void main(String[] args) 
    {
        String st;
        Scanner sc = new Scanner(System.in);
        st = sc.next();
       String st1 =  palindrome(st, 0);
       if (st1.equals(st))
       {
        System.out.println("Yes "+st+" and "+st1);
       }
       else
       {
        System.out.println("no "+st+" and "+st1);
       }
       sc.close();
       System.out.println(isPalindrome(st, 0, st.length()-1));
    }
}