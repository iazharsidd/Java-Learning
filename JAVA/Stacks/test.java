package Stacks;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        Stack<Integer> st = new Stack<>();
        Stack<Character> ct = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ascii - 48);
            } else if (ct.size() == 0) {
                ct.push(ch);
            } else {
                if (ch == '-' || ch == '+') {
                    int v1 = st.pop();
                    int v2 = st.pop();
                    if (ct.peek() == '+') {
                        st.push(v2 + v1);
                    } else if (ct.peek() == '-') {
                        st.push(v2 - v1);
                    } else if (ct.peek() == '*') {
                        st.push(v2 * v1);
                    } else if (ct.peek() == '/') {
                        st.push(v2 / v1);
                    }
                    ct.pop();
                    ct.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (ct.peek() == '*' || ct.peek() == '/') {
                        int v1 = st.pop();
                        int v2 = st.pop();
                        if (ct.peek() == '*') {
                            st.push(v2 * v1);
                        } else if (ct.peek() == '/') {
                            st.push(v2 / v1);
                        }
                        ct.pop();
                        ct.push(ch);
                    } else {
                        ct.push(ch);
                    }

                }
            }
        }
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (ct.peek() == '+') {
                st.push(v2 + v1);
            } else if (ct.peek() == '-') {
                st.push(v2 - v1);
            } else if (ct.peek() == '*') {
                st.push(v2 * v1);
            } else if (ct.peek() == '/') {
                st.push(v2 / v1);
            }
            ct.pop();
        }
        System.out.println(st.peek());
        sc.close();
    }
}
