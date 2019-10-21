package queueStackSingle;

public class App {

    public static void main(String[] args) {
        QueueStackSingle queueStackSingle = new QueueStackSingle();

        queueStackSingle.enqueue(68);
        queueStackSingle.enqueue(27);
        queueStackSingle.enqueue(96);

        System.out.println(queueStackSingle.dequeue());

        queueStackSingle.enqueue(200);

        System.out.println(queueStackSingle.dequeue());
        System.out.println(queueStackSingle.dequeue());
        System.out.println(queueStackSingle.dequeue());
    }
}
