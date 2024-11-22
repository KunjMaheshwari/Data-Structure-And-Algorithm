import java.util.*;

public class Delete {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Step 1 -> add at that last index
            arr.add(data);

            // Step 2 -> Fix the Heap
            int x = arr.size() - 1; // child index

            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) {
                // Step 3 - Swapping
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1; // LEFT CHILD
            int right = 2 * idx + 2; // RIGHT CHILD
            int minIdx = idx;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != idx) {
                // swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // Step 1 -> Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 - Delete last
            arr.remove(arr.size() - 1);

            // Step 3 -> Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String args[]) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

/*
 * Deleteing is a 3 way process.
 * Step 1 -> Swap the first and last node of the tree
 * Step 2 -> Remove the last index
 * Step 3 -> Fix the Heap using heapify function.
 */
