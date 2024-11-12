package queue;

import java.util.LinkedList;
import java.util.List;

public class PriorityQueue<T> {
    private record PQueueNode<I>(int priority, I element) {}

    private final List<PQueueNode<T>> queue = new LinkedList<>();

    public void push(int priority, T element) {
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).priority < priority)
                queue.add(i, new PQueueNode<>(priority, element));
        }
    }

    public T peek() {
        if (queue.isEmpty())
            return null;
        return queue.getFirst().element;
    }

    public T pop() {
        if (queue.isEmpty())
            return null;
        return queue.removeFirst().element;
    }

}