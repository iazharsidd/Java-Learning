package Queues;

public class CircularQ 
{
    public static class DeQ {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int x) throws Exception 
        {
            if(size == arr.length)
            {
                throw new Exception("Q is Full!!");
            }
            else if (size == 0) 
            {
                f = r = 0;
                arr[0] = x;
            }
            else if(r == arr.length-1) //0 1 2 3 4 5
            {
                r = 0;
                arr[0] = x;
            }
            else if (r < arr.length-1) {
                arr[++r] = x;
            }
            size++;
            return;
        }
        public int remove() throws Exception
        {
            if (size == 0) 
            {
                throw new Exception("Q is Empty!!");
            }
            int x = arr[f];
            if (f == arr.length-1) 
            {
                f = 0;
            }
            f++;
            size--;
            return x;
        }
        public int peek () throws Exception
        {
            if (size == 0) 
            {
                throw new Exception("The Q is Empty!");
            }
            return  arr[f];
        }
        public void display() throws Exception
        {
            if (size == 0) 
            {
                throw new Exception("Empty Q");
            }
            if (f<r){
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            if (f>r)
            {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
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
        DeQ d = new DeQ();
        // d.display();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.size();
        d.display();
        d.remove();
        d.display();
        d.add(6);
        d.display();
        System.out.println(d.peek());
    }
}