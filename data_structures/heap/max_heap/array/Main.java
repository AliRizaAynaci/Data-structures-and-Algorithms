package data_structures.heap.max_heap.array;

import data_structures.heap.max_heap.tree.MaxHeap;

public class Main {

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(3);
        maxHeap.insert(1);
        maxHeap.insert(4);
        maxHeap.insert(1);
        maxHeap.insert(5);
        maxHeap.insert(9);

        System.out.println("Max Heap:");
        maxHeap.printHeap();

        System.out.println("Extracted Max: " + maxHeap.extractMax());
        System.out.println("Max Heap after extraction:");
        maxHeap.printHeap();
    }
}
