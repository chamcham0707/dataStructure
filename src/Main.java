import LinkedList.MyDoubleLinkedList;
import queue.MyQueue;
import stack.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        System.out.println("isEmpty? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printAll();

        stack.pop();
        stack.printAll();

        System.out.println("isEmpty? " + stack.isEmpty());
    }
}