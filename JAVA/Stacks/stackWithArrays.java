package Stacks;

public class stackWithArrays 
{
    public static class Stack
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of Stack : ");
        // int size = sc.nextInt()
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x )
        {
            if (isFull()) 
            {
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int size()
        {
            return idx;
        }
        int pop()
        {
            if (idx==0) 
            {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx --;
            return top;
        }
        int peek()
        {
            if(idx == 0)
            {
                System.out.println("Stack is Empty!");
                return -1 ;
            }
            return arr[idx-1];
        }
        void display()
        {
            if (idx == 0) 
            {
                System.out.println("[]");
                return;
            }
            for (int i = 0; i < idx; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty()
        {
            if (idx == 0) 
            {
                return true;
            }
            return false;
        }
        boolean isFull()
        {
            if (idx == arr.length-1)
            {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println("The size is : " + st.size());
        st.pop();
        System.out.println("The size is : "+st.size());
        st.display();
        System.out.println(st.isFull());
    }
    
}
