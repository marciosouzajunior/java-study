
public class LinkedList {

    public static void main(String[] args) {

        ListNode rootNode = new ListNode(1, null);
        insertNode(rootNode, new ListNode(2, null));
        insertNode(rootNode, new ListNode(3, null));

        printList(rootNode);

        System.out.println("Removing node 2.");
        removeNode(rootNode, 2);

        printList(rootNode);


    }

    public static void printList(ListNode rootNode){
        do {
            System.out.println("Value: " + rootNode.value);
            rootNode = rootNode.next;
        } while (rootNode != null);
    }

    public static void insertNode(ListNode rootNode, ListNode newNode){

        // Find the latest node
        while (rootNode.next != null) {
            rootNode = rootNode.next;
        }

        // Assign the new node
        rootNode.next = newNode;

    }

    public static void removeNode(ListNode node, int value){

        ListNode previousNode = null;

        while (node.value != value) {
            previousNode = node;
            node = node.next;
        }

        previousNode.next = node.next;

    }

}

class ListNode{
    int value;
    ListNode next;

    public ListNode (int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}
