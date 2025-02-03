package Stacks;

import java.util.Stack;

public class basics 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();
        System.out.println("The size is : "+st.size());//print the size of stack which is zero ,no element is pushed till now
        System.out.println(st);// will print empty stack 
        System.out.println(st.isEmpty());//print true bc stack is empty.
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);//print [1, 2, 3, 4, 5, 6]
        System.out.println("The size is : "+st.size());// print "The size is : 6" 
        // push pop peek's time complexity is in O(1)
        System.out.println(st.peek());// print 6 -> element ion the peek of stack is 6
        st.pop();//remove the top element wich is 6 
        System.out.println(st);//print [1, 2, 3, 4, 5] 6 is poped from the stack
        System.out.println("The size is : "+st.size());//print "The size is : 5"
        // while (st.size()>1)//loop to pop out all the element except 1 indexed
        // {
        //     st.pop();
        // }
        for (int i = st.size(); i > 1 ; i--) {
            st.pop();
        }//for loop approach to pop out all element except 1 indexed element
        System.out.println(st.peek()); //print 1
        System.out.println(st);//print [1]
        System.out.println(st.isEmpty());//false
    }
}
