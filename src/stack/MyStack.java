package stack;

import LinkedList.MyDoubleLinkedList;

public class MyStack<T> {
    MyDoubleLinkedList<T> list;

    public MyStack() {
        list = new MyDoubleLinkedList<>();
    }

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        if (list.isEmpty()) return null;
        T result = list.get(list.getSize() - 1);
        list.remove(list.getSize() - 1);
        return result;
    }

    public T peek() {
        if (list.isEmpty()) return null;
        return list.get(list.getSize() - 1);
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
