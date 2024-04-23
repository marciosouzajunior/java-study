import java.util.HashMap;

/*
The brute force approach to solve this problem, would be to get all the substrings
and check which one is the longest without repeating chars.
But here I have implemented the optimal solution using the sliding window technique.
In this approach, we have a "window" which slides through the string. The start and
end variables are used to track the window size. And a hashmap is used to check
whether a char have been seen. If a char have been seen, it means the current substring
is not unique, then we move the start to its position + 1 (if it's greater than the
current start). For every iteration, the window size is calculated and stored. And the
char is added to the hash map. Finally, we move our window one char towards the end.
*/
public class LongestUniqueSubstring {

    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abba");
        assert length == 2;
    }


    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int count = 0;
        int current = 0;

        while (end < s.length()) {

            Character currentChar = s.charAt(end);

            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }

            current = end - start + 1;
            count = Math.max(count, current);

            map.put(currentChar, end);
            end++;

        }

        return count;

    }

}
