package BinaryTreeB;

public class kthLevel {


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
// To find the kth level  N
    public static void kthLevelNodes(Node root, int level, int  k ){

        if(root==null){

            return ;
        }
        if(level==k){
            System.out.print(root.data+" ");

        }
      
        kthLevelNodes(root.left, level+1, k);
        kthLevelNodes(root.right, level+1, k);
 

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
int k=3;
kthLevelNodes(root, 1, k);
        
    }
}
