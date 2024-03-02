package MyQueue;

public class MyQueue {

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