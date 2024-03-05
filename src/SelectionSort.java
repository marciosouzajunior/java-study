public class SelectionSort {

    /*
    Selection sort works by getting every element from the list
    and compare with others to check if it is the smallest element.
    If so, the values are swapped. Its complexity time is O(n^2).
     */

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 6, 3, 4, 9};
        System.out.println("Array is: ");
        for (int n : arr) {
            System.out.print(n + ",");
        }
        System.out.println("\n\nSelection sort...");
        selectionSort(arr);
        for (int n : arr) {
            System.out.print(n + ",");
        }

    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int currentNumber = arr[i];
                int compareNumber = arr[j];

                if (compareNumber < currentNumber) {
                    arr[i] = compareNumber;
                    arr[j] = currentNumber;
                }

            }

        }

    }

}
