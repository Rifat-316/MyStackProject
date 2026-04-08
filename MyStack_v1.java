public class MyStack {
    private int stackPointer;
    private int[] elements;

    public MyStack(int capacity) {
        elements = new int[capacity];
        stackPointer = -1;
    }

    public int top() {
        return elements[stackPointer];
    }

    public void push(int n) {
        elements[++stackPointer] = n;
    }

    public void pop() {
        stackPointer--;
    }

    public boolean isEmpty() {
        return stackPointer == -1;
    }

    public int getSize() {
        return stackPointer + 1;
    }
}