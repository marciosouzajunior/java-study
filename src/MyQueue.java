public class MyQueue {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        int value = myQueue.poll();
        System.out.println("Value is " + value);
        value = myQueue.poll();
        System.out.println("Value is " + value);
        value = myQueue.poll();
        System.out.println("Value is " + value);

    }


    QueueNode rootNode = null;

    public void add(int value) {

        if (rootNode == null){
            rootNode = new QueueNode(value);
        } else {
            QueueNode newNode = new QueueNode(value);
            // find the last node
            QueueNode lastNode = rootNode;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.next = newNode;
        }

    }

    public int poll(){

        int value = rootNode.value;
        rootNode = rootNode.next;
        return value;

    }

}

class QueueNode {

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