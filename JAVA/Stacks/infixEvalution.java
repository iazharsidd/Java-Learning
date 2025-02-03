package Stacks;
import java.util.*;

public class infixEvalution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    if (op.peek() == '+') {
                        val.push(v2 + v1);
                    } else if (op.peek() == '-') {
                        val.push(v2 - v1);
                    } else if (op.peek() == '*') {
                        val.push(v2 * v1);
                    } else if (op.peek() == '/') {
                        val.push(v2 / v1);
                    }
                    op.pop();
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    if (op.peek() == '+') {
                        val.push(v2 + v1);
                    } else if (op.peek() == '-') {
                        val.push(v2 - v1);
                    } else if (op.peek() == '*') {
                        val.push(v2 * v1);
                    } else if (op.peek() == '/') {
                        val.push(v2 / v1);
                    }
                    op.pop();
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v1 = val.pop();
                        int v2 = val.pop();
                        if (op.peek() == '*') {
                            val.push(v2 * v1);
                        } else if (op.peek() == '/') {
                            val.push(v2 / v1);
                        }
                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1) {
            int v1 = val.pop();
            int v2 = val.pop();
            if (op.peek() == '+') {
                val.push(v2 + v1);
            } else if (op.peek() == '-') {
                val.push(v2 - v1);
            } else if (op.peek() == '*') {
                val.push(v2 * v1);
            } else if (op.peek() == '/') {
                val.push(v2 / v1);
            }
            op.pop();
        }
        System.out.println(val.peek());
        sc.close();
    }
}