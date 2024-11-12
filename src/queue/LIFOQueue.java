package queue;

import java.util.*;

public class LIFOQueue<T> implements IQueue<T> {

    private LinkedList<T> data = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public T dequeue() {
        return data.removeLast();
    }

    @Override
    public void enqueue(T element) {
        data.add(element);
    }
}