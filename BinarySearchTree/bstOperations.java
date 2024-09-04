package BinarySearchTree;

public class bstOperations {

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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // *************** Search Opertion **************
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;

        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);

        }

    }

    // ***************** Delete Operations *****************

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);

        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            // CASE 1 No child
            if (root.left == null && root.right == null) {

                return null;

            }
            // CASE 1 single child
            if (root.left == null) {

                return root.right;

            } else if (root.right == null) {

                return root.left;
            }

            // CASE 1 two child
            Node Is = findInorderSuccessor(root.right, val);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;

    }

    public static Node findInorderSuccessor(Node root, int val) {

        while (root.right != null) {
            root = root.left;

        }
        return root;
    }

    // *************** Print IN Range ****************//

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;

        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);

        } else {
            printInRange(root.left, k1, k2);
        }

    }

    public static void main(String[] args) {

        // int arr[] = { 5, 1, 3, 4, 2, 7 };
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        // if (search(root, 1)) {
        // System.out.println("key found ");
        // } else {
        // System.out.println("key not found ");

        // }

        // inOrder(root);
        // System.out.println();

        // delete(root, 2);
        // inOrder(root);

        printInRange(root, 9, 12);

    }

}
