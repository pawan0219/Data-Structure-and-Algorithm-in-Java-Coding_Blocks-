package lec_24_Queue_Stack;

public class Stack {
    protected int[] arr;
    private int idx = -1;
    public Stack() {
        arr = new int[5];
    }
    public Stack(int n) {
        arr = new int[n];
    }
    public boolean isEmpty() {
        return idx == - 1;
    }
    public boolean isfull() {
        return size() == arr.length;
    }
    public void push(int item) throws Exception{
        if (isfull()) {
            throw new Exception("Stack full hogya");
        }
        idx++;
        arr[idx] = item;
    }
    public int size() {
        return idx + 1;
    }
    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack empty hogya");
        }
        return arr[idx];
    }
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack empty hogya");
        }
        int rv = arr[idx];
        idx--;
        return rv;
    }
    public void Display() {
        for (int i = 0; i <= idx; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
