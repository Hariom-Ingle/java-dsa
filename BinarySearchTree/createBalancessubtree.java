package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class createBalancessubtree {

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


    public static Node createBST(int arr[], int st, int end){
        if(st>end){
            return null;
        }

        int mid= (st+end)/2;
        Node root= new Node(arr[mid]);
        root.left= createBST(arr, st,mid-1);
        root.right= createBST(arr, mid+1, end);
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
        int arr[] = { 3,5,6,8,10,11,12 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        /*
                       8
                     /   \
                    5     11
                   / \    / \
                  3   6  10  12                              
*/

         
        createBST(arr, 0, 6);
        preorder(root);
        



    }
    
}
