/** 
    Hamza Siddiqui
    CSI 3620
    This file defines the MaxHeap data structure to manage Task objects based on their priority.
**/

public class MaxHeap {
    private Task[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new Task[capacity];
        size = 0;
    }

    // Add a new task to the heap
    public void insert(Task task) {
        if (size == heap.length) {
            System.out.println("Heap is full. Can't add more tasks.");
            return;
        }

        heap[size] = task;
        heapifyUp(size);
        size++;
    }

    // Show the highest priority task (root)
    public Task peek() {
        if (size == 0) {
            return null;
        }
        return heap[0];
    }

    // Remove highest priority task
    public Task extractMax() {
        if (size == 0) {
            return null;
        }

        Task max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);
        return max;
    }

    // Fix heap after inserting
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap[index].getPriority() > heap[parent].getPriority()) {
                Task temp = heap[index];
                heap[index] = heap[parent];
                heap[parent] = temp;
                index = parent;
            } else {
                break;
            }
        }
    }

    // Fix heap after removing
    private void heapifyDown(int index) {
        while (true) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;

            if (left < size && heap[left].getPriority() > heap[largest].getPriority()) {
                largest = left;
            }

            if (right < size && heap[right].getPriority() > heap[largest].getPriority()) {
                largest = right;
            }

            if (largest != index) {
                Task temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }

    // For showing all tasks in array form (not sorted)
    public void printHeap() {
        if (size == 0) {
            System.out.println("No tasks in the list.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(heap[i]);
        }
    }
}
