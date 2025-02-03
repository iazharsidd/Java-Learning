package Strings;

import java.util.Scanner;

public class toggleSB {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :-");
        st.append(sc.nextLine());
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int ascii = (int) ch;
            if (ch == ' ' || (ch >= '0' && ch <= '9'))
                continue;
            if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
                char d = (char) ascii;
                st.setCharAt(i, d);
            } else {
                ascii += 32;
                char d = (char) ascii;
                st.setCharAt(i, d);
            }
        }
        System.out.println(st);
    }
}
