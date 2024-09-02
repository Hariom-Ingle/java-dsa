package BinaryTreeB;

import Queue.stackUsingDeque;

public class diameterOfTree {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }

    }

    // ***************** APPROACH 1 St *****************
    public static int height(Node root){
        if(root==null){
            return 0;
        }
         int lh=height(root.left);
         int rh=height(root.right);
         return Math.max(lh, rh)+1;
    }

    public static int   diameter1(Node root){
        if (root== null){
            return 0;
        }
        
        int ldia= diameter1(root.left); 
        int lh=height(root.left);
        int rdia= diameter1(root.right);
        int rh=height(root.right);

        int selfdia= lh+rh +1;
        return Math.max( selfdia,Math.max(rdia, rdia));
    }

    // ***************** APPROACH 2nd **************

     static class Info {
         int diam; 
        int ht;

        public Info(int diam,int ht ){
            this.diam=diam;
            this.ht=ht;
        }

     }

     public static  Info diammeter( Node root){
        if(root==null){
            return new Info(0 ,0);
        }

        Info leftInfo= diammeter(root.left);
        Info rightInfo= diammeter(root.left);

        int diam= Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return  new Info(diam,ht);
     }
    public static void main(String[] args) {

/*
                       1
                     /   \
                    2     3
                   / \     \
                   4  5     7
                            

                           
*/

        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right  = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);

        // System.out.println(height(root));
        System.out.println(diameter1(root));

    }
}
