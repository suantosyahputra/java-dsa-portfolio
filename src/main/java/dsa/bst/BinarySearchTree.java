package dsa.bst;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // O(log n) average
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        }
        else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    // O(log n)
    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node node, int value) {

        if (node == null) {
            return false;
        }

        if (value == node.value) {
            return true;
        }

        if (value < node.value) {
            return containsRecursive(node.left, value);
        }

        return containsRecursive(node.right, value);
    }

// O(n)
public void inorder() {
    inorderRecursive(root);
    System.out.println();
}

private void inorderRecursive(Node node) {

    if (node != null) {

        inorderRecursive(node.left);

        System.out.print(node.value + " ");

        inorderRecursive(node.right);
    }
}

// O(log n) average
public void delete(int value) {
    root = deleteRecursive(root, value);
}

private Node deleteRecursive(Node node, int value) {
    if (node == null) {
        return null;
    }

    if (value < node.value) {
        node.left = deleteRecursive(node.left, value);
    } else if (value > node.value) {
        node.right = deleteRecursive(node.right, value);
    } else {
        // case 1: no child
        if (node.left == null && node.right == null) {
            return null;
        }

        // case 2: one child
        if (node.left == null) {
            return node.right;
        }

        if (node.right == null) {
            return node.left;
        }

        // case 3: two children
        int minValue = findMin(node.right);
        node.value = minValue;
        node.right = deleteRecursive(node.right, minValue);
    }

    return node;
}

private int findMin(Node node) {
    while (node.left != null) {
        node = node.left;
    }
    return node.value;
}

}

