package data_structures.heap.min_heap.tree;

public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(4);
        minHeap.insert(1);
        minHeap.insert(5);
        minHeap.insert(9);

        System.out.println("Min Heap:");
        minHeap.printHeap();

        System.out.println("Extracted Min: " + minHeap.extractMin());
        System.out.println("Min Heap after extraction:");
        minHeap.printHeap();
    }
}
