package BinarySearchTree;

 
 
public class mirroraBST {

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

    // *********** Print Root to Leaf  path ***********//

    public static Node   mirrorBST( Node root){
        if(root== null){
            return null;
        }
        Node lefts=mirrorBST(root.left);
        Node rights=mirrorBST(root.right);

        root.left=rights;
        root.right=lefts;
        return root;

    }
    
    public static void  preorder(Node root){
        if(root==null){
            // System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
        int arr[] = { 8, 5, 3, 6, 10, 11,14 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        root= mirrorBST(root);
        preorder(root);



    }
    
}