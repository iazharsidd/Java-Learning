package Trees;

import java.util.Stack;

public class DepthFirstSearch 
{
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val = val;
        }
    }
    static void preorder(Node root)
    {
        if (root == null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            Node temp = st.pop();
            System.out.print(temp.val+" ");
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }
    }
    static void inorder(Node root)
    {
        if (root == null ) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            Node temp = st.peek();
            if (temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            }
            else{
                st.pop();
                System.out.print(temp.val+" ");
                if (temp.right != null) st.push(temp.right);
            }
        }
    }
    static void postorder(Node root)
    {
        if (root == null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) 
        {
            Node temp = st.peek();
            if (temp.left != null)
            {
                st.push(temp.left);
                temp.left = null;
            }
            else if (temp.right != null) {
                st.push(temp.right);
                temp.right = null;
            }
            else
            {
                System.out.print(st.pop().val+" ");
            }
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.left = b;
        a.right = c;
        Node d = new Node(4);
        Node e = new Node(5);
        b.left = d;
        b.right = e;
        Node f = new Node(6);
        Node g = new Node(7);
        c.left = f;
        c.right = g;
        // inorder(a);
        // System.out.println();
        // preorder(a);
        // System.out.println();
        postorder(a);
    }
}