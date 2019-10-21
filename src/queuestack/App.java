package queuestack;

public class App {

    public static void main(String[] args) {
        QueueStack queue = new QueueStack();

        queue.enqueue(23);
        queue.enqueue(16);
        queue.enqueue(28);

        System.out.println(queue.dequeue());

        queue.enqueue(120);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
