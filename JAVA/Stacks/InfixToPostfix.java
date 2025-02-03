package Stacks;

import java.util.*;

public class InfixToPostfix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Infix Expression : ");
        String str = sc.nextLine();
        Stack <String> st = new Stack<>();
        Stack <Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <=57) 
            {
                String s = "" + ch;
                st.push(s);
            }
            else if (op.isEmpty() || op.peek() == '(' || ch == '(') 
            {
                op.push(ch);
            }
            else if (ch == ')') 
            {
                while (op.peek() != '(') 
                {
                    String a = st.pop();
                    String b = st.pop();
                    char o = op.pop();
                    st.push(b + a + o);
                }
                op.pop();
            }
            else
            {
                if (ch == '+' || ch == '-') 
                {
                    String a = st.pop();
                    String b = st.pop();
                    char o = op.pop();
                    st.push(b+a+o);
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') 
                {
                    if (op.peek() == '*' || op.peek() == '/') 
                    {
                        String a = st.pop();
                        String b = st.pop();
                        char o = op.pop();
                        st.push(b + a + o);
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }
                }
            }
        }
        while (st.size() > 1) 
        {
            String a = st.pop();
            String b = st.pop();
            char o = op.pop();
            st.push(b + a + o);
        }
        System.out.println(st.peek());  
        sc.close();     
    } 
}