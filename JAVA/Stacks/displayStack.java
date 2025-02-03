package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class displayStack 
{
    public static void displayrev(Stack <Integer> s  )
    {
        // if (s.size()==0)
        // {
        //     return;            
        // }
        if (s.isEmpty()) {
            return;
        }
        System.out.print(s.peek()+" ");
        s.pop();
        displayrev(s);
    }
    public static void displayrec(Stack <Integer> s  )
    {
        if (s.isEmpty()) 
        {
            return;
        }
        int t = s.pop();
        displayrec(s);
        System.out.println(t+" ");
    }
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemnts : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        Stack <Integer> st = new Stack<>();
        for (int i = 1; i <= n; i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }
        displayrev(st);
        // Stack <Integer> t = new Stack<>();
        // while (!st.isEmpty()) 
        // {
        //     t.push(st.pop());
        // }
        // while (!t.isEmpty())
        // {
        //     int x = t.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }
        // FOR LOOP SE 
        // int k = st.size();
        // int[] arr =  new int[k];
        // for (int i = k-1; i >= 0; i--)
        // {
        //     int x = st.pop();
        //     arr[i] = x;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
        sc.close();
    }
    
}
