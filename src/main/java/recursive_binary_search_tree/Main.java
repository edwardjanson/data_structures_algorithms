package recursive_binary_search_tree;

public class Main {

    public static void main(String[] args) {

        RecursiveBinarySearchTree myBST = new RecursiveBinarySearchTree();

        myBST.rInsert(5);
        myBST.rInsert(10);
        myBST.rInsert(7);
        myBST.rInsert(12);
        myBST.rInsert(8);
        myBST.rInsert(17);

        System.out.println(myBST.getRoot().value);

        System.out.println(myBST.rContains(6));
        System.out.println(myBST.rContains(11));
        System.out.println(myBST.rContains(8));

        myBST.deleteNode(10);
        System.out.println(myBST.getRoot().right.value);

        System.out.println(myBST.getRoot().right.left.right.value);
    }
}
