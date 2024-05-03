import LinkedList.MyDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.isEmpty());

        System.out.println("20 is contain? " + list.containData(20));
        System.out.println("50 is contain? " + list.containData(50));

        int data = list.get(1);
        System.out.println(data);

        list.remove(1);

        list.printAll();
        list.clear();
        System.out.println(list.isEmpty());
        list.printAll();
    }
}