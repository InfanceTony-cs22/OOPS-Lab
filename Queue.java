import java.util.LinkedList;
import java.util.Queue;

class CustomQueue<T> {
    private Queue<T> queue;

    public CustomQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.poll();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        CustomQueue<Integer> customQueue = new CustomQueue<>();

        customQueue.enqueue(10);
        customQueue.enqueue(20);
        customQueue.enqueue(30);

        System.out.println("Queue size: " + customQueue.size());
        System.out.println("Front element: " + customQueue.peek());

        System.out.println("Dequeue element: " + customQueue.dequeue());
        System.out.println("Queue size after dequeue: " + customQueue.size());
    }
}
