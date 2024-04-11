import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(1);
        countSwaps(nums);
    }

    public static void countSwaps(List<Integer> a) {

        int swaps = 0;
        boolean swapped = false;

        do {

            swapped = false;

            for (int i = 0; i < a.size() - 1; i++) {
                if (a.get(i) > a.get(i + 1)) {
                    java.util.Collections.swap(a, i, i + 1);
                    swapped = true;
                    swaps++;
                }

            }

        } while (swapped);

        System.out.println("Array is sorted in " + swaps + " swaps.");

    }

}
