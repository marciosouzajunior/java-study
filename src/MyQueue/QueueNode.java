package MyQueue;

public class QueueNode {

    QueueNode next;
    int value;

    public QueueNode(int value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}