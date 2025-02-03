package Queues;

public class ArrayImplementation 
{
    public static class ArrayQ
    {
        int f = -1;
        int r = -1;
        int size = 0 ;
        int[] arr = new int[5];
        public void add (int x)
        {
            if (size == arr.length) 
            {
                System.out.println("Queue is Full!");
                return;
            }
            if(f == -1) 
            {
                f = 0;
            }    
            arr[++r] = x;
            size++;
            return;
        }
        public int poll()
        {
            if (f == r) 
            {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        public int peek()
        {
            if (f == r) 
            {
                System.out.println("Queue is Empty!");
                return -1;   
            }
            return arr[f];
        }
        public int size()
        {
            return size;
        }
        public void display()
        {
             if (f == -1 || f > r) {
                System.out.println("Queue is Empty!");
                return;
             }
            for(int i = f;i <= r;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) 
    {
        ArrayQ q = new ArrayQ();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.poll();
        q.display();
        System.out.println(q.size());
    }
}
