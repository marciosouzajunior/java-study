public class BinarySearchTree {

    /*
    In a Binary Search Tree (BST), first we check if the element is in the middle.
    If so, then we found it. If not, we recursively check if it is present in the
    left or right side of the tree.

    Because we have only to check half of the tree, the average time complexity is O(log n).
    Worst case can be O(n) in case it is not a balanced tree and the searched element
    exists ate the end of the tree.

    For a balance tree it is always O(log n), because subtrees size does not differ by more than 1.
    It means the halves have almost same height. Space complexity is always O(N).
    */
    public static void main(String[] args) {

        BinarySearchTree binarySearch = new BinarySearchTree();
        int[] array = new int[]{1, 2, 3, 4, 5};
        int result = binarySearch.binarySearchTree(array,0, array.length - 1, 100
        );
        if (result > -1){
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

    }

    public int binarySearchTree(int[] array, int start, int end, int element) {

        if (end < start) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (element == array[middle]) {
            return middle;
        }

        if (element > array[middle]) {
            return binarySearchTree(array, middle + 1, end, element);
        } else {
            return binarySearchTree(array, start, middle - 1, element);
        }

    }

}
