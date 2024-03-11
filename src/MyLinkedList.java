
public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);

        linkedList.print();
        linkedList.search(2);
        linkedList.search(5);

    }

}

class LinkedList {

    ListNode first, last;

    public void insertNode(int value) {

        ListNode newNode = new ListNode(value);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;
        }

    }

    public void search(int value) {

        ListNode currentNode = first;
        while (currentNode != null) {
            if (currentNode.value == value) {
                System.out.println("Value found: " + value);
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Value not found");

    }

    public void remove(ListNode node, int value) {

        ListNode previousNode = null;

        while (node.value != value) {
            previousNode = node;
            node = node.next;
        }

        previousNode.next = node.next;

    }

    public void print() {
        ListNode currentNode = first;
        do {
            System.out.println("Value: " + currentNode.value);
            currentNode = currentNode.next;
        } while (currentNode != null);
    }

}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}
