package data_structures.heap.min_heap.array;

import java.util.ArrayList;
import java.util.List;

public class MinHeap<T extends Comparable<T>> {
    private List<T> heapList;

    public MinHeap() {
        heapList = new ArrayList<>();
    }

    // Insert an element into the MinHeap.
    public void insert(T element) {
        heapList.add(element);
        heapifyUp(); // Maintain the MinHeap property by moving the newly added element up the heap.
    }

    // Extract and remove the minimum element from the MinHeap.
    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("MinHeap is empty");
        }

        T min = heapList.get(0);
        int lastIndex = heapList.size() - 1;
        heapList.set(0, heapList.get(lastIndex)); // Replace the root with the last element.
        heapList.remove(lastIndex); // Remove the last element.
        heapifyDown(); // Maintain the MinHeap property by moving the root element down the heap.
        return min;
    }

    // Check if the MinHeap is empty.
    public boolean isEmpty() {
        return heapList.isEmpty();
    }

    // Move an element up the heap to maintain the MinHeap property.
    private void heapifyUp() {
        int currentIndex = heapList.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (heapList.get(currentIndex).compareTo(heapList.get(parentIndex)) >= 0) {
                break; // Stop if the element is greater than or equal to its parent.
            }
            swap(currentIndex, parentIndex); // Swap the element with its parent if it's smaller.
            currentIndex = parentIndex;
        }
    }

    // Move an element down the heap to maintain the MinHeap property.
    private void heapifyDown() {
        int currentIndex = 0;
        int heapSize = heapList.size();
        while (true) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            int smallestChildIndex = currentIndex;

            if (leftChildIndex < heapSize && heapList.get(leftChildIndex).compareTo(heapList.get(smallestChildIndex)) < 0) {
                smallestChildIndex = leftChildIndex; // Find the index of the smaller child.
            }

            if (rightChildIndex < heapSize && heapList.get(rightChildIndex).compareTo(heapList.get(smallestChildIndex)) < 0) {
                smallestChildIndex = rightChildIndex; // Update the index of the smaller child.
            }

            if (smallestChildIndex == currentIndex) {
                break; // Stop if the current element is smaller than both children.
            }

            swap(currentIndex, smallestChildIndex); // Swap with the smaller child and continue.
            currentIndex = smallestChildIndex;
        }
    }

    // Swap two elements in the heap.
    private void swap(int index1, int index2) {
        T temp = heapList.get(index1);
        heapList.set(index1, heapList.get(index2));
        heapList.set(index2, temp);
    }
}
