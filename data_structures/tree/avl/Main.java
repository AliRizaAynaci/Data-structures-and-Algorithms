package data_structures.tree.avl;

public class Main {

    public static void main(String[] args) {
        // Create a new AVL Tree instance.
        AVLTree tree = new AVLTree();

        // Insert elements into the AVL tree.
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);
        tree.insert(25);
        tree.insert(35);
        tree.insert(50);

        System.out.println("Inorder Traversal:");
        // Perform an inorder traversal of the AVL tree to display it in ascending order.
        tree.inorder();

        System.out.println("\n\nPreorder Traversal:");
        // Perform a preorder traversal of the AVL tree to display it in a top-down manner.
        tree.preorder();

        System.out.println("\n\nPostorder Traversal:");
        // Perform a postorder traversal of the AVL tree to display it in a bottom-up manner.
        tree.postorder();

        int searchData = 25;
        boolean found = tree.search(searchData);
        System.out.println("\n\nIs " + searchData + " found in the AVL tree? " + found);

        int removeData = 30;
        tree.remove(removeData);
        System.out.println("\n" + removeData + " removed from the AVL tree. Updated state:");
        tree.inorder();  // Display the updated AVL tree in inorder traversal.
    }
}
