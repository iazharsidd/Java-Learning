package LinkedList;

public class Basics 
{
    public static void inserAtEnd(Node head,int val)
    {
        Node temp = new Node(val);
        Node t = head ;
        while (t.next!=null)
        {
            t=t.next;
        }
        t.next = temp;
    }
    public static int Displaylen(Node head)
    {
        if(head==null)
        {
            return 0;
        }
        return 1 + Displaylen(head.next);
    }
    public static int length(Node head)
    {
        int c=0;
        while (head!=null) 
        {
            c++;
            head = head.next;   
        }
        return c;
    }
    public static void Displayrec(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        Displayrec(head.next);
    }
    // public static void Display(Node head)
    // {
    //     Node temp = head;
    //     while (temp!=null) 
    //     {
    //         System.out.print(temp.data+" ");
    //         temp=temp.next;
    //     }
    // }
    public static class Node
    {
        int data;
        Node next ;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[] args) 
    {
        Node x = new Node(5);
        Node y = new Node(6);
        Node z = new Node(7);
        Node a = new Node(8);
        Node b = new Node(9);
        x.next = y;
        y.next = z;
        z.next = a;
        a.next = b;
        // System.out.println(x.next);
        // System.out.println(b);
        // // System.out.println(x.next.data);
        // System.out.println(x.data);
        // System.out.println(x.next.data);
        // System.out.println(x.next.next.data);
        // System.out.println(x.next.next.next.data);
        // System.out.println(x.next.next.next.next.data);
        // System.out.println(x.next.next.next.next.next.data);
        // Node temp = x;
        // for (int i = 1; i <= 5; i++) 
        // {
        //     System.out.print(temp.data+" ");
        //     temp= temp.next;
        // }
        // Node temp = x;
        // while (temp!=null) 
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        // Displayrec(x);
        // System.out.println(length(x));
        System.out.println(Displaylen(x));
        inserAtEnd(x, 87);
        Displayrec(x);
    }
}