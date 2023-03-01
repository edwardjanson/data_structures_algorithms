package recursive_binary_search_tree;

public class Main {

    public static void main(String[] args) {

        RecursiveBinarySearchTree myBST = new RecursiveBinarySearchTree();

        myBST.insert(5);
        myBST.insert(10);
        myBST.insert(6);
        myBST.insert(8);
        myBST.insert(17);

        System.out.println(myBST.getRoot().value);

        System.out.println(myBST.rContains(6));
        System.out.println(myBST.rContains(11));
        System.out.println(myBST.rContains(8));

        System.out.println(myBST.getRoot().right.left.right.value);
    }
}
