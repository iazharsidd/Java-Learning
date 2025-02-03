package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class implemantation 
{ 
    static class Node
    {
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val = val;
        }
    } 
    static void bfs(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }
    static void nthlevel(Node root, int n)
    {
        if(root == null) return;
        if (n == 1) {
            System.out.print(root.val+" ");
            return;//to make better time complexity!!!
        }
        nthlevel(root.left, n-1);
        nthlevel(root.right, n-1);
    }
    static int product(Node root)
    {
        if (root.left == null && root.right == null) return root.val;
        return root.val * product(root.left) * product(root.right);
    }
    static int height(Node root)
    {
        if (root == null ||  (root.left == null && root.right == null )) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    static int maximum(Node root)
    {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maximum(root.right),maximum(root.left)));
    }
    static int sum(Node root)
    {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    static void preOrderTraversal(Node root)
    {
        if (root == null) return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    static void inOrderTraversal(Node root)
    {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.println("In -> "+root.val);
        inOrderTraversal(root.right);
    }
    static void postOrderTraversal(Node root)
    {
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println("post->"+root.val);
    }
    static int size(Node root)
    {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);

    }
    static void display(Node root)
    {
        if (root == null) {
            return;
        }
        System.out.print(root.val+"->");
        if (root.left != null) System.out.print(root.left.val+",");
        else System.out.print("null,");
        if (root.right != null) System.out.print(root.right.val);
        else System.out.print("null");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) 
    {
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
        // display(a);
        // System.out.println(size(a));
        // preOrderTraversal(a);
        // System.out.println(sum(a));
        // System.out.println(maximum(a));
        // System.out.println(height(a));
        // System.out.println(product(a));
        // inOrderTraversal(a);
        // postOrderTraversal(a);
        // nthlevel(a, 2);
        // for (int i = 1; i <= height(a)+1; i++) {
        //     nthlevel(a, i);
        //     System.out.println();           
        // }
        bfs(a);
    }
}