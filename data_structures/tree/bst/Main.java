package data_structures.tree.bst;

public class Main {

    public static void main(String[] args) {
        // Create a new Binary Search Tree (BST).
        BinarySearchTree tree = new BinarySearchTree();

        // Insert elements into the BST.
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversal:");
        // Perform an inorder traversal of the BST.
        tree.inorder();

        System.out.println("\nPreorder Traversal:");
        // Perform a preorder traversal of the BST.
        tree.preorder();

        System.out.println("\nPostorder Traversal:");
        // Perform a postorder traversal of the BST.
        tree.postorder();

        System.out.println("\n\nAfter removing an element:");
        // Remove an element from the BST and perform an inorder traversal.
        tree.remove(30);
        tree.inorder();
    }
}
