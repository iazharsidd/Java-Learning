package Strings;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) 
        {
            char ch = st.charAt(i);
            int ascii = (int)ch;
            // if(ch == ' '|| (ascii >= 48 && ascii <= 57) ) continue;
            if (ch == ' ' || (ch >= '0' && ch <= '9')) {
                continue;
            }
            if (ch >= 'a' && ch <= 'z') 
            {
                ascii -= 32;
                char d = (char)ascii;
                st = st.substring(0, i) + d + st.substring(i+1);
            }
            else
            {
                ascii += 32;
                char d = (char) ascii;
                st = st.substring(0, i) + d + st.substring(i + 1);
            }
        }
        System.out.println(st);
    }
}