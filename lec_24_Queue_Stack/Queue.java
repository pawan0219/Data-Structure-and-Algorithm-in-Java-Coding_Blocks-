package lec_24_Queue_Stack;

public class Queue {
    protected int[] arr;
    protected int size = 0;
    protected int front = 0;

    public Queue() {
        arr = new int[5];
    }
 
    public Queue(int n) {
        arr = new int[n];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isfull() {
        return size() == arr.length;
    }
    public void EnQueue(int item) throws Exception{
        if (isfull()) {
            throw new Exception("queue full hai");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }
    public int getfront() throws Exception {
        if (isEmpty()) {
            throw new Exception("khali hai");
        }
        return arr[front];
    }
    public int DeQueue() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue KHALI hai");
        }
        int v = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return v;
    }
    public int size() {
        return size;
    }
    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
