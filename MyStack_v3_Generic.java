import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    public T top() {
        return elements.get(elements.size() - 1);
    }

    public void push(T n) {
        elements.add(n);
    }

    public void pop() {
        elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}