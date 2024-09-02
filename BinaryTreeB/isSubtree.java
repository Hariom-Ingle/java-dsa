package BinaryTreeB;

public class isSubtree {
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




    public  static boolean  isSubtree(Node root, Node subRoot){
        if(root== null){
            return false;
        }
        if(root.data== subRoot.data){ // this  will check  the root of the tree is equal to the  root of the subtree if equal then it will  passs parameter to the  isIdentical 
                                    // this will be for each root of the tree 
            if(isIdnetical(root,subRoot)) {
                return true;

            }
        }

        // if the root is not equal to the rootofthe sub tree root  then it will  check to the  left and right side of  the tree 
        
        return  isSubtree(root.left, subRoot) ||isIdnetical(  root.right, subRoot);

        // isSubtree(root.left, subRoot) ||isIdnetical(  root.right, subRoot);
        //   this  way of writing  is good bcz if we get  false value form this isSubtree(root.left, subRoot) then  the compiler will not
        //   check the  this  ||isIdnetical(  root.right, subRoot) direclty return  the value as false if si was true then  check for the  second codn. 
    }
 
    public static  boolean isIdnetical( Node node , Node subRoot){
        if( node==null && subRoot==null){
            return true;

        }else if(node==null || subRoot==null || node.data != subRoot.data){
            // if anyone node is nulll or any  the data present  is not equal the it  retun false;
            return false;
            
        }
        //check in left tree and left subroot
        if(!isIdnetical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdnetical(node.right, subRoot.right)){
            return false;
        }

        return true; 
    }
        

     
    public static void main(String[] args) {

/*                 MAIN TREE 
                       1
                     /   \
                    2     3
                   / \     \
                  4   5     7
*/
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right  = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);

/*                 SUB TREEE
                       2
                     /   \
                    4     5
*/
        Node subRoot  = new Node(2);
        subRoot.left  = new Node(4);
        subRoot.right  = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }

}
