package Stacks;
import java.util.*;

public class postfixtoprefix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postfix Expression : ");
        String str = sc.nextLine();
        Stack <String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) 
            {
                String s = ""+ch;
                st.push(s);
            }
            else
            {
                String a = st.pop();
                String b = st.pop();
                st.push(ch+b+a);
            }   
        }   
        System.out.println(st.peek());
        sc.close();
    }   
}