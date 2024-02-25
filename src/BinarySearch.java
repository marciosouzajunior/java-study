public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] array = new int[]{1, 2, 3, 4, 5};
        int result = binarySearch.binarySearch(array,0, array.length - 1, 100
        );
        if (result > -1){
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

    }

    public int binarySearch(int[] array, int start, int end, int element) {

        if (end < start) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (element == array[middle]) {
            return middle;
        }

        if (element > array[middle]) {
            // search right
            return binarySearch(array, middle + 1, end, element);
        } else {
            // search left
            return binarySearch(array, start, middle - 1, element);
        }

    }

}
