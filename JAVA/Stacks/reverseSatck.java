package Stacks;

import java.util.*;

public class reverseSatck {
    public static void pushAtBottom(Stack<Integer> s, int x) {
        if (s.size() == 0) {
            s.push(x);
            return;
        }
        int t = s.pop();
        pushAtBottom(s, x);
        s.push(t);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.size() == 1) {
            return;
        }
        int x = s.pop();
        reverse(s);
        pushAtBottom(s, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        sc.close();
    }
}
