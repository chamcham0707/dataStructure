import LinkedList.MyDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        // MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<Integer>();
        MyDoubleLinkedList<String> list = new MyDoubleLinkedList<String>();
        System.out.println(list.isEmpty());
        list.add("apple");
        list.add("banana");
        list.add("car");
        System.out.println(list.isEmpty());

        System.out.println("apple is contain? " + list.containData("apple"));
        System.out.println("dance is contain? " + list.containData("dance"));

        System.out.println(list.get(1));

        list.remove(1);

        list.printAll();
        list.clear();
        System.out.println(list.isEmpty());
        list.printAll();
    }
}