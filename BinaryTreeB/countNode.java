package BinaryTreeB;

public class countNode {

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

    static int count=0;
    public static int  nodeCount(Node root){
        if (root==null) {
            return 0;
            
        }
        int lh=nodeCount(root.left);
        int rh=nodeCount(root.right);
      count=lh+rh+1;
        return count ;

    }

    public static void main(String[] args) {


        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right  = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);
        root.right.right.left  = new Node(8);

        System.out.println(nodeCount(root));
        
    }
    
}
