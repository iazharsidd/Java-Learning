package Stacks;
import java.util.*;

public class prefixEvaluation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the prefix Equation : ");
        String str = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) 
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >=48 && ascii <=57) 
            {
                st.push(ascii-48);   
            }
            else
            {
                int a = st.pop();
                int b = st.pop();
                if (ch == '+') 
                {
                    st.push(a+b);    
                }
                else if (ch == '-') {
                    st.push(a - b);
                }
                else if (ch == '*') {
                    st.push(a * b);
                }
                else if (ch == '/') {
                    st.push(a / b);
                }
            }
        }
        sc.close();
    }
}