import java.util.ArrayList;

class Max_heap {
    ArrayList<Integer> heap = new ArrayList<>();

    // Insert element into Max Heap
    public void insert(int value) {
        heap.add(value); // Add at last
        int index = heap.size() - 1;

        // Heapify Up
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent) < heap.get(index)) {
                // Swap
                int temp = heap.get(parent);
                heap.set(parent, heap.get(index));
                heap.set(index, temp);

                index = parent;
            } else {
                break;
            }
        }
    }

    public void display() {
        System.out.println(heap);
    }
    public void delete() {
        // Swap first and last element
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.set(heap.size() - 1, temp);

        // Remove last element
        heap.remove(heap.size() - 1);

        // Heapify Down
        int index = 0;
        while (index < heap.size()) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left >= heap.size() && right >= heap.size()) {
                break;
            } else if (right >= heap.size()) {
                if (heap.get(index) < heap.get(left)) {
                    int temp1 = heap.get(index);
                    heap.set(index, heap.get(left));
                    heap.set(left, temp1);
                }
                break;
            } else {
                if (heap.get(index) < heap.get(left) || heap.get(index) < heap.get(right)) {
                    if (heap.get(left) > heap.get(right)) {
                        int temp2 = heap.get(index);
                        heap.set(index, heap.get(left));
                        heap.set(left, temp2);
                        index = left;
                    } else {
                        int temp   = heap.get(index);
                        heap.set(index, heap.get(right));
                        heap.set(right, temp);
                        index = right;
                    }
                } else {
                    break;
                }
            }
        }
            }

    public static void main(String[] args) {
        Max_heap h = new Max_heap();

        h.insert(10);
        h.insert(20);
        h.insert(15);
        h.insert(30);
        h.insert(40);

        h.display();
    }
}