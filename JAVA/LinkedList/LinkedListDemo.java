package LinkedList;

public class LinkedListDemo 
{
    public static class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class linkedlist
    {
        Node head = null;
        Node tail = null; 
        int size = 0;
        void insertAtEnd(int val)
        {
            Node temp = new Node(val);
            if (head == null) 
            {
                head = temp;
            }
            else
            {
            tail.next = temp;
            }
            tail = temp;
            size++;
        }
        //Print the linked list
        void Display()
        {
        Node temp = head;
        while (temp!=null)
        {
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        }
        //Length of Linked List
        // int length() 
        // {
        //     // int c = 0;
        //     // Node temp = head;
        //     // while (temp != null) {
        //     //     c++;
        //     //     temp = temp.next;
        //     // }
        //     // return c;
        //     return size;
        // }
        void inserAtBegining (int val)
        {
            Node temp = new Node(val);
            if (head == null)//Empty List
            {
                head = temp;
                tail = temp;
            }
            else //non Empty 
            {
                temp.next = head;
                temp = head;
            }
            size++;
        }
        void insertAtidx(int idx, int val)
        {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) 
            {
                insertAtEnd(val);
                return;
            }
            if (idx == 0) 
            {
                inserAtBegining(val);
                return;
            }
            for (int i = 1; i < idx-1; i++) 
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx)
        {
            if (idx<0 || idx > size) 
            {
                System.out.println("Wrong idx");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++)
            {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx)
        {
            if (idx == 0)
            {
                head = head.next;
                size --;
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size-1) 
            {
                tail = temp;
            }
            size--;
        }
    }
    public static void main(String[] args) 
    {
        linkedlist ll = new linkedlist();
        ll.inserAtBegining(4);
        ll.insertAtEnd(5);
        ll.insertAtidx(2, 6);
        ll.insertAtEnd(15);
        ll.insertAtEnd(25);
        // System.out.println(ll.getAt(1));
        ll.Display();
        System.out.println();
        // System.out.println(ll.size);
        ll.deleteAt(0);
        ll.Display();
        System.out.println();
        System.out.println(ll.size);
        
    }   
}