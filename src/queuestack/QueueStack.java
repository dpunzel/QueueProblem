package queuestack;

import java.util.Stack;

public class QueueStack {

    // one stack for enqueue operation
    private Stack<Integer> enqueueStack;

    // second stack for dequeue operation
    private Stack<Integer> dequeueStack;

    public QueueStack() {
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    // adding an item to the queue is O(1) time
    public void enqueue(int item) {
        this.enqueueStack.push(item);
    }

    // removing item
    public int dequeue() {
        // no items in the stack
        if ()
    }
}
