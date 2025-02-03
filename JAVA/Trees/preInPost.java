package Trees;

public class preInPost 
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
    // public static void pip(int n )
    // {
    //     if (n == 0) return ;
    //     System.out.println("Pre "+n);
    //     pip(n-1);
    //     System.out.println("In "+n);
    //     pip(n-1);
    //     System.out.println("Post "+n );
    // }

    public static void preorder(Node root)
    {
        if (root == null) return;
        // pre order is root left right
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void inorder(Node root) {
        if (root == null)
            return;
        // inorder is left root right
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root == null) return;
        // postorder is left right root
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
    public static void nthLevel(Node root,int n)
    {
        if(root == null) return;
        if (n == 1)     
        {
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    
    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) 
    {
        // pip(3);
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Postorder");
        postorder(root);
        int n = 3;
        System.out.println("Level "+3);
        nthLevel(root,n);
        // System.out.println();
        // int level = 1 + height(root);
        // for (int i = 1; i <= level; i++) 
        // {
        //     nthLevel(root, i);
        //     System.out.println();
        // }
    }
}