package Stacks;
import java.util.*;

public class postfixEvaluation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Postfix Expression : ");
        String str = sc.nextLine();
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            int ascii =  (int)ch;
            if (ascii >= 48 && ascii <= 57) 
            {
                st.push(ascii-48);
            }
            else
            {
                int v1 = st.pop();
                int v2 = st.pop();
                if (ch == '+') 
                {
                    st.push(v2+v1);
                }
                else if (ch == '-') {
                    st.push(v2 - v1);
                }
                else if (ch == '*') {
                    st.push(v2 * v1);
                }
                else if (ch == '/') {
                    st.push(v2 / v1);
                }
            }
        }
        System.out.println(st.peek());
        sc.close();
    }
    
}
