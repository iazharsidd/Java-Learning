package Stacks;

import java.util.*;

public class prefixToInfix 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Prefix Expression : ");
        String str = sc.nextLine();
        Stack <String> st = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) 
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii  >= 48 && ascii <= 57 ) 
            {
                String s = "" + ch;
                st.push(s);
            }
            else
            {
                String a = st.pop();
                String b = st.pop();
                String r = "("+a+ch+b+")";
                st.push(r);
            }
        }
        System.out.print(st.peek());
        sc.close();
    }
}
