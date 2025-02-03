package Stacks;
import java.util.*;

public class insertingRecursion 
{
    public static Stack <Integer> insertAtAny(Stack <Integer> s ,int e ,int i)
    {
        if (s.size()==i )
        {
            s.push(e);
            return s;
        }
        int x = s.pop();
        insertAtAny(s, e, i);
        s.push(x);
        return s;
    }
    public static Stack <Integer> insertAtEndRec(Stack<Integer> s , int e)
    {
        if (s.isEmpty()) 
        {
            s.push(e);
            return s;
        }
        int x = s.pop();
        insertAtEndRec(s, e);
        s.push(x);
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements : ");
        for (int i = 0; i < n; i++) 
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        System.out.print("Enter the element to be inserted : ");
        int e = sc.nextInt();
        System.out.print("Enter the index to be inserted At : ");
        int i = sc.nextInt();
        System.out.println(insertAtAny(st, e, i));
        sc.close();
    }
}
