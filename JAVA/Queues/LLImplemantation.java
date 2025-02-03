package Queues;

public class LLImplemantation 
{
    public static class Node //user defined data type 
    {
        int val;
        Node next;
        Node (int val )
        {
            this.val = val;
        }
    }
    public static class QLink
    {
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x)
        {
            Node temp = new Node(x);
            if (size == 0 ) 
            {
                head = tail = temp;
            }
            else
            {
            tail.next = temp;
            tail = temp;
            }
            size++;   
            return; 
        }
        public int remove()
        {
            if (size == 0) 
            {
                System.out.println("Queue is fulll!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public int peek()
        {
            return head.val;
        }
        public int size()
        {
            return size;
        }
        public void display()
        {
            if (size == 0) 
            {
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = new Node(0);
            temp = head;
            while (temp != null) 
            {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
    }
    public static void main(String[] args) 
    {
        QLink q = new QLink();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size());
    }
    
}
