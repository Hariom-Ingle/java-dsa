package BinarySearchTree;

import java.util.ArrayList;

public class merge2BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getinOrder(Node root, ArrayList<Integer> Inorder) {
        if (root == null) {
            return;
        }
        getinOrder(root.left, Inorder);
        Inorder.add(root.data);
        getinOrder(root.right, Inorder);

    }

    public static Node mergeBST(Node root1, Node root2) {
        // step 1 get Inorder
        ArrayList<Integer> bst1 = new ArrayList<>();
        getinOrder(root1, bst1);

        ArrayList<Integer> bst2 = new ArrayList<>();
        getinOrder(root2, bst2);

        // merge
        int i = 0, j = 0;
        ArrayList<Integer> finalList = new ArrayList<>();

        while (i < bst1.size() && j < bst2.size()) {
            if (bst1.get(i) <= bst2.get(j)) {
                finalList.add(bst1.get(i));
                i++;
            } else {
                finalList.add(bst2.get(j));
                j++;
            }

        }
        while (i < bst1.size()) {

            finalList.add(bst1.get(i));
            i++;

        }
        while (j < bst2.size()) {

            finalList.add(bst2.get(j));
            j++;

        }

        // create a BSt from sortrd arraylist
        return createBST(finalList, 0, finalList.size() - 1);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;

    }

    // preorder
    public static  void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"  ");
        preOrder(root.left);
        preOrder(root.right);

        
    }
    public static void main(String[] args) {

        // BST 1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST 2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);



        /*
                    3
                  /   \
                 1     9
                  \   / \
                  2  4   12

                ****** Final BST ******  
         */

        Node root=mergeBST(root1, root2);
        preOrder(root);

    }

}
