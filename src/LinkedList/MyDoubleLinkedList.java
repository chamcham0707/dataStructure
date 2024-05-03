package LinkedList;

public class MyDoubleLinkedList {
    private DLLNode head;
    private DLLNode tail;
    private int size;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int data) {
        DLLNode node = new DLLNode(data);

        if (head == null) { // head에 값이 없다면 즉, 처음 들어오는 데이터라면 head에 값을 넣어주어야 한다.
            // 처음들어오는 값은 head이자 tail이다.
            head = node;
            tail = node;
        } else {
            tail.nextNode = node; // 마지막에 노드를 추가해주어야 한다.
            node.prevNode = tail; // 이전에 있던 마지막 노드와 연결 해주어야 한다.
            tail = node; // tail을 업데이트 해주어야 한다.
        }
        ++size; // 데이터가 하나 추가되었으니 기록해준다.
    }

    public void remove(int index) {
        DLLNode node = head;
        for (int i = 0; i < index; ++i) { // 해당 인덱스까지 순차 조회를 하며 삭제할 노드를 찾는다.
            node = node.nextNode;
        }

        if (node == head) { // 삭제할 노드가 head라면 head의 다음 노드를 head로 변경하고 이전 노드는 null로 바꿔줘야 한다.
            head = node.nextNode;
            head.prevNode = null;
        } else if (node == tail) { // 삭제할 노드가 tail이라면 tail 이전 노드를 tail로 변경하고 다음 노드는 null로 바꿔줘야 한다.
            tail = node.prevNode;
            tail.nextNode = null;
        } else { // head, tail 둘 다 아니라면 중간에 있는 노드이므로, 삭제할 노드 이전과 다음 노드를 연결 시켜주어야 한다.
            node.prevNode.nextNode = node.nextNode;
            node.nextNode.prevNode = node.prevNode;
        }

        --size; // 노드 하나를 삭제했으므로 size를 줄여주어야 한다.
    }

    public int getSize() {
        return size;
    }

    public void printAll() {
        DLLNode node = head;
        System.out.print("[ ");
        for (int i = 0; i < size; ++i) { // 기록해두었던 size만큼 반복문을 돌면서 head부터 값을 출력해준다.
            System.out.print(node.data + " ");
            node = node.nextNode;
        }
        System.out.println("]");
    }
}
