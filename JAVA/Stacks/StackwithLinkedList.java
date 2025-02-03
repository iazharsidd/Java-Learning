package Stacks;

public class StackwithLinkedList 
{
    public static class Node 
    {
        int val;
        Node next ;
        Node(int val)
        {
            this.val = val;
        }
    }
    public static class Stack
    {
        private Node head = null;
        private int size = 0;
        void push (int x)
        {
         Node n = new Node(x);
         n.next = head;
         head = n; 
         size++;
        }
        int pop()
        {
            if (head == null) 
            {
                System.out.println("Stack is Empty!");
                return -1;                
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
        int peek()
        {
            if (head == null) 
            {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty()
        {
            if (size == 0) 
            {
                return true;
            }
            return false;
        }
        void displayrec(Node h)
        {
            if (h == null )
            {
                return ;
            }
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display()
        {
            displayrec(head);
        }
        int size()
        { 
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println("\n"+st.size());
        System.out.println("\nAfter poping");
        st.pop();
        st.display();
        System.out.println("\n"+st.size());
    }
}