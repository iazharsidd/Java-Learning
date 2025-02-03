package Recursion;

import java.util.Scanner;

public class printSubsequences
{
    public static void GetString(String st,String cA)
    {
        if (st.length()== 0)
        {
           System.out.println(cA);
            return ;
        }
        char ch = st.charAt(0);
        String s = st.substring(1);
        GetString(s, cA+ch);
        GetString(s, cA);

    }
    public static void main(String[] args) 
    {
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        st = sc.next();
        GetString(st,"");
        sc.close();
    }
}
