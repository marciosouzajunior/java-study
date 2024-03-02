package MyQueue;

/*
*  In this queue version, I'm keeping a reference
*  to the last node of the queue. Then using this
*  last node to append new nodes, making the add
*  operation O(1).
*/
public class MyQueue2 {

    QueueNode first = null;
    QueueNode last = null;

    public void add(QueueNode qn){

        if (isEmpty()) {
            first = qn;
            last = qn;
            return;
        }

        last.next = qn;
        last = qn;

    }

    public boolean isEmpty(){
        return first == null;
    }

    public void print(){

        if (isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        QueueNode printNode = first;
        do {
            System.out.println(printNode.value);
            printNode = printNode.next;
        } while (printNode != null);

    }

}
