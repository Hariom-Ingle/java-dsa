package BinarySearchTree;
import java.util.ArrayList;
 

public  class binaryTree_to_BST  {
    // 
    // ********  problem statement:- create a balance  tree   
    // 
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }  

    // function to print  tree  In preorder seq
    public static void  preorder(Node root){
        if(root==null){
            // System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    //   function to get inorder  and  sorted array
    public static void getInorder(Node root, ArrayList<Integer>Inorder ){
        if(root==null){
            return;
        }
        getInorder(root.left, Inorder);
        Inorder.add(root.data);
        getInorder(root.right, Inorder);
    }

    // main funct 
    public static Node balanceBST( Node root){
        // handle inorder  the array to get a array  as sorted
        ArrayList<Integer>Inorder = new ArrayList<>();
        getInorder(root, Inorder);

        /// sorted Inorder ------> BST
        root= createBST(Inorder, 0, Inorder.size()-1);
        return root;
    }

    //   to conver a balance tree

    public static Node  createBST( ArrayList<Integer>Inorder,int si, int end){

        if(si>end){
            return null;
        }

        int mid= (si+end)/2;
        Node root= new Node(Inorder.get(mid));
        root.left=createBST(Inorder, si,mid-1);
        root.right= createBST(Inorder, mid+1, end);

        return root;
    }

    public static void main(String[] args) {
         

         /*           8
                     / \
                    6   10
                   /     \
                  5       11
                 /         \
                3           12
                Current tree (unbalance Binary Tree)
         */


        Node root = new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);      

        /*
                       8
                     /   \
                    5     11
                   / \    / \
                  3   6  10  12     
               
                ***  Expected Balance Tree *** 
                8,5,3,6,8,11,10,12                          
        */

        root= balanceBST(root);
        preorder(root);
        
    }
}


