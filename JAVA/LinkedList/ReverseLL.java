package LinkedList;

public class ReverseLL 
{
    public static void main(String[] args) 
    {   
        //imported from node class
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        //object of Linked List Class to Access print methods
        LinkedList l = new LinkedList();
        l.head = a;//agr different classes se hain dono objects to humein head ko point karana hoga isliye l.head ko a pr point karaya hai iska matlb ab l ka head a hai 
        l.print();
        System.out.println();
        l.printrev(a);
        // System.out.println();
        // System.out.println(l.reverse(a));
    }
}