package Trie_DataStructure;

// ************** Prefix Problem ***********

// Find shortest unique prefix for every word in a given list.

// Assume no word is prefix of another.

// arr[] = {"zebra", "dog", "duck", "dove"}

// ans = ("z", "dog", "du", "dov")

public class Q2_prefixProblem {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;
        
        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 0;
        }
    }

    public static Node root = new Node();

    // Function to insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++;
        }
        curr.eow = true;
    }

    // Function to find the shortest unique prefix for a given word
    public static String findPrefix(Node node, String prefix) {
        if (node == null) {
            return "";
        }
        if (node.freq == 1) {
            return prefix;
        }

        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) {
                String result = findPrefix(node.children[i], prefix + (char) (i + 'a'));
                if (!result.isEmpty()) {
                    return result;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        // Insert words into the Trie
        for (String word : arr) {
            insert(word);
        }

        // Find and print the shortest unique prefix for each word
        for (String word : arr) {
            Node curr = root;
            String prefix = "";
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                curr = curr.children[idx];
                prefix += word.charAt(i);
                if (curr.freq == 1) {
                    break;
                }
            }
            System.out.println(prefix);
        }
    }
}
