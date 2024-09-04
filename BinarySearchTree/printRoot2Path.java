package BinarySearchTree;

import java.util.ArrayList;

public class printRoot2Path {

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

    // *********** Print Root to Leaf  path ***********//

    public static void printRoot2LeafPath( Node root, ArrayList<Integer>path){

        if(root==null){
            return;

        }
        path.add(root.data);

        if(root.right==null && root.left==null){
            
            printPath(path);
        }
        printRoot2LeafPath(root.left, path);
        printRoot2LeafPath(root.right, path);
        path.remove(path.size()-1);

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
        int arr[] = { 8, 5, 3, 6, 10, 11,14 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        printRoot2LeafPath(root, new ArrayList<>());

        
    }
    
}
