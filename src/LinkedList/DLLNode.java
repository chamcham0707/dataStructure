package LinkedList;

public class DLLNode<T> {
    T data;
    DLLNode prevNode;
    DLLNode nextNode;

    // 생성자 오버라이딩으로 유연성을 높여주었다.
    public DLLNode(T data) {
        this.data = data;
    }

    public DLLNode(T data, DLLNode prevNode, DLLNode nextNode) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }
}
