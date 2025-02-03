package Stacks;
import java.util.*;
public class validParanthesis 
{
    public static boolean isValid(String s)
    {
        Stack <Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') 
            {
                st.push(ch);   
            }
            else  
            { 
                if (st.isEmpty()) 
                {
                    return false;
                }
                else if (st.peek() == '(' && ch == ')') 
                {
                    st.pop();
                }
                else if (st.peek() == '{' && ch == '}') 
                {
                    st.pop();
                }
                else if(st.peek() == '[' && ch == ']')
                {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) 
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st = sc.nextLine();
        System.out.println(isValid(st));
        sc.close();
    }
}
