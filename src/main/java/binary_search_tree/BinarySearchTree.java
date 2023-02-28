package binary_search_tree;

public class BinarySearchTree {

    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public void getRoot() {
        if (this.root == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + this.root.value);
        }
    }
}
