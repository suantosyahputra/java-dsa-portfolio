package dsa.bst;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(20);

        System.out.println("contains 7? " + bst.contains(7));
        System.out.println("contains 99? " + bst.contains(99));

        System.out.print("inorder: ");
        bst.inorder();
    }
}