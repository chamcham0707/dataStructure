import LinkedList.MyDoubleLinkedList;
import queue.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        System.out.println(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.isEmpty());

        queue.printAll();
    }
}