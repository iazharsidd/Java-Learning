package LinkedList;

public class DoublyLL 
{
    public static class Node 
    {
        int val;
        Node next;
        Node prev;
        Node (int val)
        {
            this.val = val;
        }  
    }
    public static void print(Node head)
    {
        Node h = head;
        while (h != null) 
        {
            System.out.print(h.val+" ");
            h = h.next;
        }
    }
    public static void printrev(Node tail)
    {
        Node t = tail;
        while (t != null) 
        {
            System.out.print(t.val + " ");
            t = t.prev;
        }
    }
    public static void printrandom (Node random)
    {
        Node temp = random;
        while (temp.prev != null) 
        {
            temp = temp.prev;
        }
        print(temp);
    }
    public static Node insertAtBegining(Node head,int val)
    {
        Node t = new Node(val);
        t.next = head;
        t.prev = null;
        head.prev = t;
        head = t;
        return head;
    }
    public static Node insertAtEnd(Node head, int val)
    {
        Node t = new Node(val);
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = t;
        t.prev = temp;
        t.next = null;
        return head;
    }
    public static Node insertAtAny(Node head,int idx,int val)
    {
        Node t = new Node(val);
        Node temp = head;
        for (int i = 1; i < idx - 1; i++) 
        {
            temp = temp.next;
        }
        t.next = temp.next;
        t.prev = temp;
        temp.next.prev = t;
        temp.next = t;
        return head;
    }
    public static Node deleteHead(Node head)
    {
        head = head.next;
        head.prev = null;
        return head;
    }
    public static void main(String[] args) 
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        // print(a);
        // System.out.println();
        Node newHead = deleteHead(a);
        print(newHead);
    }
}
