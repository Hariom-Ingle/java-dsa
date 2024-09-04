package BinarySearchTree;

import java.util.ArrayList;

public class isValidateBST {

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

    // ***********  Is Validate  BST ***********//

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
    
        if (min != null && root.data <= min.data) {
            return false;
        }
    
        if (max != null && root.data >= max.data) {
            return false;
        }
    
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    
   

    public static  void printPath( ArrayList<Integer>path)
    {
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
        // System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = { 8, 5, 3, 6, 10, 11,14 };
        int arr[] = {30, 20, 40, 10, 25};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }


        if(isValidBST(root, null, null)){
            System.out.println("validate");
        }else{
            System.out.println("not validate ");
        }
    }
    
}
