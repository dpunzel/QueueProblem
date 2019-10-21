package queueStackSingle;

import java.util.Stack;

/**
 * A single stack queue
 */
public class QueueStackSingle {
    // one stack for enqueue operation
    private Stack<Integer> stack;

    public QueueStackSingle() {
        this.stack = new Stack<>();
    }

    // method to add item to queue O(1) time
    public void enqueue(int item) {
        this.stack.push(item);
    }

    // recursive call utilizing application stack memory
    public int dequeue() {
        // base case if stack FIFO item found
        if (stack.size() == 1) {
            return stack.pop();
        }

        // pop items until last is found
        int item = stack.pop();

        // calling recursively to find
        int lastItem = dequeue();

        enqueue(item);

        return lastItem;
    }
}
