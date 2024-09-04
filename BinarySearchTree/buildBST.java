package BinarySearchTree;

public class buildBST {

    static class Node {
        int data;
        Node left;
        Node right;

       Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);

    }

    public static void main(String[] args) {

        int arr[]= {5,1,3,4,2,7};
        Node root= null;

        for(int i = 0; i<arr.length;i++){
            root=insert(root, arr[i]);
        }

        preOrder(root);
        System.out.println();

    }

}
