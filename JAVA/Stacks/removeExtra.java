package Stacks;

import java.util.*;
public class removeExtra 
{
    public static int removeBracket(String s)
    {
        Stack<Character> st = new Stack<>();
        int c = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(') 
            {
                st.push(ch);
                c++;
            }
            else
            {
                if(st.isEmpty())
                {
                    c++;
                }
                else
                {
                    st.pop();
                    c--;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.println(removeBracket(s));
        sc.close();
    }
    
}
