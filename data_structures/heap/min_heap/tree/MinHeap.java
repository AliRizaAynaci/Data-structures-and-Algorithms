package data_structures.heap.min_heap.tree;

import data_structures.tree.avl.AVLTree;

public class MinHeap {
    private AVLTree avlTree;

    public MinHeap() {
        avlTree = new AVLTree();
    }

    // Insert a new element into the MinHeap
    public void insert(int data) {
        avlTree.insert(data);
    }

    // Extract and return the minimum element from the MinHeap
    public int extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int minValue = avlTree.findMin();
        avlTree.remove(minValue);
        return minValue;
    }

    // Check if the MinHeap is empty
    public boolean isEmpty() {
        return avlTree.isEmpty();
    }

    // Get the minimum element in the MinHeap without removing it
    public int getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        return avlTree.findMin();
    }

    // Print the contents of the MinHeap
    public void printHeap() {
        System.out.print("Min Heap: ");
        avlTree.inorder();
        System.out.println();
    }
}
