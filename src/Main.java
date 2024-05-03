import LinkedList.MyDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.isEmpty());

        int data = list.get(1);
        System.out.println(data);

        list.remove(1);

        list.printAll();
        list.clear();
        System.out.println(list.isEmpty());
        list.printAll();
    }
}