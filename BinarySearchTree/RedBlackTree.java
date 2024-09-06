package BinarySearchTree;

 
public class RedBlackTree {
    public Node root; // root node

    public RedBlackTree() {
        super();
        root = null;
    }

    class Node {
        int data;
        Node left, right, parent;
        char colour; // 'R' for Red, 'B' for Black

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.colour = 'R'; // default colour is Red
            this.parent = null;
        }
    }

    // This function performs left rotation
    Node rotateLeft(Node node) {
        Node x = node.right;
        Node y = x.left;

        // Perform rotation
        x.left = node;
        node.right = y;
        node.parent = x;

        if (y != null) {
            y.parent = node;
        }

        // Return new root
        return x;
    }

    // This function performs right rotation
    Node rotateRight(Node node) {
        Node x = node.left;
        Node y = x.right;

        // Perform rotation
        x.right = node;
        node.left = y;
        node.parent = x;

        if (y != null) {
            y.parent = node;
        }

        // Return new root
        return x;
    }

    // Flags for rotations
    boolean ll = false;
    boolean rr = false;
    boolean lr = false;
    boolean rl = false;

    // Helper function for insertion. It performs all tasks in a single pass
    Node insertHelp(Node root, int data) {
        // f is true when RED RED conflict is there
        boolean f = false;

        // Insert the node as you would in a BST
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {
            root.left = insertHelp(root.left, data);
            root.left.parent = root;
            if (root != this.root && root.colour == 'R' && root.left.colour == 'R') {
                f = true;
            }
        } else if (data > root.data) {
            root.right = insertHelp(root.right, data);
            root.right.parent = root;
            if (root != this.root && root.colour == 'R' && root.right.colour == 'R') {
                f = true;
            }
        } else {
            return root; // Duplicate keys not allowed
        }

        // Update root height and handle rotations
        if (this.ll) {
            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            this.ll = false;
        } else if (this.rr) {
            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';
            this.rr = false;
        } else if (this.rl) {
            root.right = rotateRight(root.right);
            root.right.parent = root;
            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            this.rl = false;
        } else if (this.lr) {
            root.left = rotateLeft(root.left);
            root.left.parent = root;
            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';
            this.lr = false;
        }

        // Handle RED RED conflict
        if (f) {
            if (root.parent.right == root) {
                if (root.parent.left == null || root.parent.left.colour == 'B') {
                    if (root.left != null && root.left.colour == 'R') {
                        this.rl = true;
                    } else if (root.right != null && root.right.colour == 'R') {
                        this.ll = true;
                    }
                } else {
                    root.parent.left.colour = 'B';
                    root.colour = 'B';
                    if (root.parent != this.root) {
                        root.parent.colour = 'R';
                    }
                }
            } else {
                if (root.parent.right == null || root.parent.right.colour == 'B') {
                    if (root.left != null && root.left.colour == 'R') {
                        this.rr = true;
                    } else if (root.right != null && root.right.colour == 'R') {
                        this.lr = true;
                    }
                } else {
                    root.parent.right.colour = 'B';
                    root.colour = 'B';
                    if (root.parent != this.root) {
                        root.parent.colour = 'R';
                    }
                }
            }
            f = false;
        }

        return root;
    }

    // Function to insert data into the tree
    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            this.root.colour = 'B'; // root is always black
        } else {
            this.root = insertHelp(this.root, data);
        }
    }

    // Helper function to print inorder traversal
    void inorderTraversalHelper(Node node) {
        if (node != null) {
            inorderTraversalHelper(node.left);
            System.out.printf("%d ", node.data);
            inorderTraversalHelper(node.right);
        }
    }

    // Function to print inorder traversal
    public void inorderTraversal() {
        inorderTraversalHelper(this.root);
        System.out.println();
    }

    // Helper function to print the tree
    void printTreeHelper(Node root, int space) {
        int i;

        if (root != null) {
            space += 10;

            printTreeHelper(root.right, space);

            System.out.println();
            for (i = 10; i < space; i++) {
                System.out.print(" ");
            }
            System.out.print(root.data);

            printTreeHelper(root.left, space);
        }
    }

    // Function to print the tree
    public void printTree() {
        printTreeHelper(this.root, 0);
    }

    public static void main(String[] args) {
        RedBlackTree t = new RedBlackTree();
        int[] arr = {1, 4, 6, 3, 5, 7, 8, 2, 9};

        for (int i = 0; i < arr.length; i++) {
            t.insert(arr[i]);
            t.inorderTraversal();
        }
        t.printTree();
    }
}

