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

        System.out.print("inorder before delete: ");
        bst.inorder(); // 2 5 7 10 15 20

        bst.delete(2); // leaf
        System.out.print("after deleting 2: ");
        bst.inorder(); // 5 7 10 15 20

        bst.delete(15); // one child
        System.out.print("after deleting 15: ");
        bst.inorder(); // 5 7 10 20

        bst.delete(10); // two children
        System.out.print("after deleting 10: ");
        bst.inorder(); // 5 7 20
    }
}