import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyStack {
    private List<Integer> stack;

    public MyStack() {
        // Use ArrayList or LinkedList as the underlying data structure
        // Uncomment one of the following lines based on your preference:
        // this.stack = new ArrayList<>();
        this.stack = new LinkedList<>();
    }

    public void push(int element) {
        stack.add(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class MainStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Pop elements from the stack and print them
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
