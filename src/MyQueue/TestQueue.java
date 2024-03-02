package MyQueue;

public class TestQueue {

    public static void main(String[] args) {

        System.out.println("Queue test v1");
        MyQueue q1 = new MyQueue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        int value = q1.poll();
        System.out.println("Value is " + value);
        value = q1.poll();
        System.out.println("Value is " + value);
        value = q1.poll();
        System.out.println("Value is " + value);

        System.out.println("\n***\n");

        System.out.println("Queue test v2");
        MyQueue2 q2 = new MyQueue2();
        q2.print();
        q2.add(new QueueNode(1));
        q2.add(new QueueNode(2));
        q2.add(new QueueNode(3));
        q2.print();
        //value = q1.poll();
        //System.out.println("Value is " + value);
        //value = q1.poll();
        //System.out.println("Value is " + value);
        //value = q1.poll();
        //System.out.println("Value is " + value);

    }

}
