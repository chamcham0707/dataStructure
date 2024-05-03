package LinkedList;

public class DLLNode {
    int data;
    DLLNode prevNode;
    DLLNode nextNode;

    // 생성자 오버라이딩으로 유연성을 높여주었다.
    public DLLNode(int data) {
        this.data = data;
    }

    public DLLNode(int data, DLLNode prevNode, DLLNode nextNode) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }
}
