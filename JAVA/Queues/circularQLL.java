package Queues;

public class circularQLL 
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int val)
        {
            data = val;
        }
    }
    public static class QLL
    {
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x)
        {
            Node temp = new Node(x);
            if (size == 0) 
            {
                head = tail = temp;
                tail.next = head;
                size++;
                return;
            }
            tail.next = temp;
            tail = temp;
            tail.next = head;
            size++;
            return ;
        }
        public  int remove() throws Exception
        {
            if (size == 0) 
            {
                throw new Exception("Q is Empty!!");
            }
            int x = head.data;
            head = head.next;
            tail.next = head;
            size--;
            return x;
        }
        public int element() throws Exception
        {
            if(size == 0)
            {
                throw new Exception("Q is Emptyy!!");
            }
            int x = head.data;
            return x;
        }
        public void display() 
        {
            if (size == 0)
            { 
                System.out.println("[]");
                return;
            }
            Node t = head;
            do
            {
                System.out.print(t.data+" ");
                t = t.next;
            } while (t != head); 
            System.out.println();
        }
        public void size()
        {
            System.out.println("The size is : "+size);
            return;
        }
    }
    public static void main(String[] args) throws Exception
    {
        QLL q = new QLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.size();   
        q.remove();
        q.display();
        q.add(1);
        q.display();
    }
    
}
