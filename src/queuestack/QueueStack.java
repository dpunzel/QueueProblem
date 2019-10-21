package queuestack;

import java.util.Stack;

/**
 * Queue Stack with 2 stacks
 * popping off the 1st item put onto the stack.
 * Stack with queue
 */
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
        if (enqueueStack.isEmpty())
            throw new RuntimeException("Stacks are empty..");

        // when dequeueStack is empty adding O(N) time
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        // pop off an item O(1) time
        return dequeueStack.pop();
    }


}
