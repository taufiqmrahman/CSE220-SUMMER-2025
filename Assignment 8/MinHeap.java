//task1
class MinHeap{

    private static int size;
    private static int [] heap;

    MinHeap(int capacity){
        size = 0;
        heap = new int[capacity];
    }

    public static void insert(int key){
        if(size<heap.length-1){
            size++;
            heap[size] = key;
            swim(size);
        }
    }

    public static void swim(int idx){
        if(idx<=1){
            return;
        }
        int parent = idx/2;
        if(heap[parent]>heap[idx]){
            int temp = heap[parent];
            heap[parent] = heap[idx];
            heap[idx] = temp;
            swim(parent);
        }
    }
    public static int extractMin(){
        if(size==0){
            return -1;
        }
        int min = heap[1];
        heap[1] = heap[size];
        size--;
        sink(1);
        return min;
    }
    public static void sink(int idx){
        int smallest = idx;
        int left = 2*idx;
        int right = 2*idx + 1;
        if(left<=size && heap[left]<heap[smallest]){
            smallest = left;
        }
        if(right<=size && heap[right]<heap[smallest]){
            smallest = right;
        }
        if(smallest!=idx){
            int temp = heap[idx];
            heap[idx] = heap[smallest];
            heap[smallest] = temp;
            sink(smallest);
        }
    }
    public void Sort() {
        int originalSize = size;
        for (int i = size ; i > 1; i--) {
            swap(1, i);
            size--;
            sink(1);
        }
        size = originalSize;
    }
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    //
    public void printSorted() {
        Sort();
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    

}