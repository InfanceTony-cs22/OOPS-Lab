import java.util.EmptyStackException;

class Stack {
    private static final int MAX_SIZE = 100;
    private int top;
    private int[] elements;

    public Stack() {
        top = -1;
        elements = new int[MAX_SIZE];
    }

    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowError("Stack is full");
        }
        elements[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
    }
}
