package queue;

public class Main {

    public static void getQueueInfo(Queue queue) {
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        System.out.println();
    }

    public static void main(String[] args) {

        Queue myQueue = new Queue(4);
        getQueueInfo(myQueue);

        myQueue.enqueue(3);
        getQueueInfo(myQueue);

        myQueue.dequeue();

        System.out.println("\nQueue:");
        myQueue.printQueue();
    }
}
