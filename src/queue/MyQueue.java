package queue;

import LinkedList.MyDoubleLinkedList;

public class MyQueue<T> {
    private MyDoubleLinkedList<T> list;

    public MyQueue() {
        list = new MyDoubleLinkedList<>();
    }

    public void enqueue(T data) {
        list.add(data);
    }

    public T dequeue() {
        T result = list.get(0);
        list.remove(0);
        return result;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printAll() {
        System.out.print("[ ");
        for (int i = 0; i < list.getSize(); ++i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");
    }
}
