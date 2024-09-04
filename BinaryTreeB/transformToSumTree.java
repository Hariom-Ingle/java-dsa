package BinaryTreeB;

import java.util.LinkedList;
import java.util.Queue;

import Recursion.recursionproblem;

public class transformToSumTree {

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

     public static int transform(Node root){

        if(root== null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null? 0:root.left.data;
        int newRight = root.right == null? 0:root.right.data;

        root.data=newLeft+leftChild+newRight+rightChild;
        return data;


     }

      public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node>q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if (q.isEmpty()) {
                       break;                    
                    } else{
                        q.add(null);
                    }

                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);

                    }
                    if(currNode.right  != null){
                        q.add(currNode.right);
                    }
                }
                
            }

        }


 
    



    public static void main(String[] args) {


        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right  = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);
        // root.right.right.left  = new Node(8);

         
    transform(root);
 
    levelOrder(root);
    }
    


}
