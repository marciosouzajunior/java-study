public class ArrayToBinaryTree {

    public static void main(String[] args) {
        System.out.println("hello world");

        int[] arr = new int[]{1, 2, 3, 4};

        Node node = createTree(arr, 0, arr.length - 1);


    }

    static Node createTree(int[] arr, int start, int end){

        if (start > end){
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node();
        node.value = arr[mid];

        node.left = createTree(arr, start, mid - 1);
        node.right = createTree(arr, mid + 1, end);

        return node;

    }

}

class Node {
    int value;
    Node left;
    Node right;
}