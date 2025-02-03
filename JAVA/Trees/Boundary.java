import java.util.LinkedList;
import java.util.Queue;

public class Boundary {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static void nthlevel(Node var0, int var1) {
        if (var0 != null) {
            if (var1 == 1) {
                System.out.print(var0.val + " ");
            } else {
                nthlevel(var0.left, var1 - 1);
                nthlevel(var0.right, var1 - 1);
            }
        }
    }

    static Node constructbfs(String[] arr) {
        Queue<Node> q = new LinkedList<>();
        int n = Integer.parseInt(arr[0]);
        Node root = new Node(n);
        q.add(root);
        for (int i = 1; i < arr.length - 1; i += 2) {
            Node temp = q.poll();
            Node left = new Node(i);
            Node right = new Node(i + 1);
            if (arr[i].equals("")) {
                left = null;
            } else {
                left.val = Integer.parseInt(arr[i]);
                q.add(left);
            }
            if (arr[i + 1].equals("")) {
                right = null;
            } else {
                right.val = Integer.parseInt(arr[i + 1]);
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
        }
        return root;
    }
    public static void leftBoundary(Node root)
    {
        if(root == null) return;
        if (root.left == null && root.right == null) return;
        System.out.print(root.val+" ");
        if(root.left != null) leftBoundary(root.left);
        else leftBoundary(root.right);
    }
    public static void baseBoundary(Node root)
    {
        if (root == null) return;
        if (root.left == null && root.right == null) System.out.print(root.val+" ");
        baseBoundary(root.left);
        baseBoundary(root.right);
    }
    public static void rightBoundary(Node root)
    {
        if(root == null) return;
        if (root.left == null && root.right == null) return;
        // System.out.print(root.val+" ");
        if(root.right != null) rightBoundary(root.right);
        else rightBoundary(root.left);
        System.out.print(root.val + " "); // to print in reverse
    }
    public static void boundaryDisplay(Node root)
    {
        leftBoundary(root);
        baseBoundary(root);
        rightBoundary(root.right);
    }
    public static void main(String[] args) {
        String[] arr = { "1", "2", "3", "4", "5", "", "6", "7","", "8","", "9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root = constructbfs(arr);
        // for (int i = 1; i <= height(root) + 1; i++) {
        //     nthlevel(root, i);
        //     System.out.println();
        // }
        boundaryDisplay(root);
    }
}