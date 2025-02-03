package Trees;

public class minXproduct 
{
    public static class Node 
    {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val = val;
        }
    }
    public static int min(Node root)
    {
        if (root == null) 
        {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    public static int product(Node root)
    {
        if (root == null) 
        {
            return 1;
        }
        // if (root.left == null && root.right == null) 
        // {
        //     return root.val;
        // }
        return root.val * product(root.left) * product(root.right);

    }
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        Node a = new Node(1);
        Node b = new Node(2);
        root.left = a;
        root.right = b;
        Node c = new Node(3);
        Node d = new Node(4);
        a.left = c;
        a.right = d;
        Node e = new Node(5);
        Node f = new Node(6);
        b.left = e;
        b.right = f;
        System.out.println(product(root));
    }
}