package BinaryTreeB;

import java.util.LinkedList;
import java.util.Queue;

public class buildTree {

    static class Node {
        int data ;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
 
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
    
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public static void  preorder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
    
        }
        public static void  inOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            preorder(root.left);
            System.out.print(root.data+" ");
            preorder(root.right);
    
        }
        public static void  postOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
    
        }

        ////////// LEVEL ORDER ////////////

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
    }

   
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree= new BinaryTree();
        Node root =tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.preorder(root);

        tree.levelOrder(root);
        
    }
}
