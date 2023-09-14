package data_structures.heap.max_heap.tree;

import data_structures.tree.avl.AVLTree;

public class MaxHeap {
    private AVLTree avlTree;

    public MaxHeap() {
        avlTree = new AVLTree();
    }

    // Insert a new element into the MaxHeap
    public void insert(int data) {
        avlTree.insert(data);
    }

    // Extract and return the maximum element from the MaxHeap
    public int extractMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int maxValue = avlTree.findMax();
        avlTree.remove(maxValue);
        return maxValue;
    }

    // Check if the MaxHeap is empty
    public boolean isEmpty() {
        return avlTree.isEmpty();
    }

    // Get the maximum element in the MaxHeap without removing it
    public int getMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int maxValue = avlTree.findMax();
        return maxValue;
    }

    // Print the contents of the MaxHeap
    public void printHeap() {
        System.out.print("Max Heap: ");
        avlTree.inorderReverse();
        System.out.println();
    }
}
