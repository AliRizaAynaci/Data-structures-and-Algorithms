package data_structures.heap.max_heap.array;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap<T extends Comparable<T>> {
    private List<T> heapList;

    public MaxHeap() {
        heapList = new ArrayList<>();
    }

    // Insert an element into the MaxHeap.
    public void insert(T element) {
        heapList.add(element);
        heapifyUp(); // Maintain the MaxHeap property by moving the newly added element up the heap.
    }

    // Extract and remove the maximum element from the MaxHeap.
    public T extractMax() {
        if (isEmpty()) {
            throw new IllegalStateException("MaxHeap is empty");
        }

        T max = heapList.get(0);
        int lastIndex = heapList.size() - 1;
        heapList.set(0, heapList.get(lastIndex)); // Replace the root with the last element.
        heapList.remove(lastIndex); // Remove the last element.
        heapifyDown(); // Maintain the MaxHeap property by moving the root element down the heap.
        return max;
    }

    // Check if the MaxHeap is empty.
    public boolean isEmpty() {
        return heapList.isEmpty();
    }

    // Move an element up the heap to maintain the MaxHeap property.
    private void heapifyUp() {
        int currentIndex = heapList.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (heapList.get(currentIndex).compareTo(heapList.get(parentIndex)) <= 0) {
                break; // Stop if the element is smaller than or equal to its parent.
            }
            swap(currentIndex, parentIndex); // Swap the element with its parent if it's larger.
            currentIndex = parentIndex;
        }
    }

    // Move an element down the heap to maintain the MaxHeap property.
    private void heapifyDown() {
        int currentIndex = 0;
        int heapSize = heapList.size();
        while (true) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            int largestChildIndex = currentIndex;

            if (leftChildIndex < heapSize && heapList.get(leftChildIndex).compareTo(heapList.get(largestChildIndex)) > 0) {
                largestChildIndex = leftChildIndex; // Find the index of the larger child.
            }

            if (rightChildIndex < heapSize && heapList.get(rightChildIndex).compareTo(heapList.get(largestChildIndex)) > 0) {
                largestChildIndex = rightChildIndex; // Update the index of the larger child.
            }

            if (largestChildIndex == currentIndex) {
                break; // Stop if the current element is larger than both children.
            }

            swap(currentIndex, largestChildIndex); // Swap with the larger child and continue.
            currentIndex = largestChildIndex;
        }
    }

    // Swap two elements in the heap.
    private void swap(int index1, int index2) {
        T temp = heapList.get(index1);
        heapList.set(index1, heapList.get(index2));
        heapList.set(index2, temp);
    }
}
