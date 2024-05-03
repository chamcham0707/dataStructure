import LinkedList.MyDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);

        list.printAll();
    }
}