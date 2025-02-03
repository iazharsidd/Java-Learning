package Stacks;
import java.util.*;
public class removeAtAnyIndex 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        Stack <Integer> st = new Stack<>(); 
        System.out.print("Enter the Elements : ");
        for (int i = 0; i < n; i++) 
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print("Enter the index of element to be removed (1 based indexing ): ");
        int i = sc.nextInt();
        Stack <Integer> nt = new Stack<>();
        while(st.size() > i)
        {
            nt.push(st.pop());
        }
        st.pop();
        while (nt.size()>0) 
        {
            st.push(nt.pop());
        }
        System.out.print(st);
        sc.close();
    }
}
