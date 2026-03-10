package dsa.projects.taskscheduler;

import java.util.ArrayList;

public class MaxHeap {

    private ArrayList<Task> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(Task task) {
        heap.add(task);
        heapifyUp();
    }

    public Task extractMax() {

        if (heap.isEmpty()) {
            return null;
        }

        Task max = heap.get(0);
        Task last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown();
        }

        return max;
    }

    private void heapifyUp() {

        int index = heap.size() - 1;

        while (index > 0) {

            int parent = (index - 1) / 2;

            if (heap.get(index).getPriority() <= heap.get(parent).getPriority()) {
                break;
            }

            swap(index, parent);
            index = parent;
        }
    }

    private void heapifyDown() {

        int index = 0;

        while (index < heap.size()) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < heap.size() &&
                heap.get(left).getPriority() > heap.get(largest).getPriority()) {
                largest = left;
            }

            if (right < heap.size() &&
                heap.get(right).getPriority() > heap.get(largest).getPriority()) {
                largest = right;
            }

            if (largest == index) {
                break;
            }

            swap(index, largest);
            index = largest;
        }
    }

    private void swap(int i, int j) {

        Task temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public Task peek() {
        return heap.isEmpty() ? null : heap.get(0);
    }

    public int size() {
        return heap.size();
    }
}