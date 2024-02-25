package StringExercices;

import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String[] args) {

        boolean result = checkPalindromePermutation("tact coa");
        System.out.println("Is it a permutation of a palindrome? " + result);

    }

    public static boolean checkPalindromePermutation(String str) {

        HashMap<Character, Integer> stringMap = new HashMap<>();

        // Add to map ignoring space
        for(char c : str.toCharArray()){

            if (c == ' '){
                continue;
            }

            if (stringMap.get(c) == null){
                stringMap.put(c, 1);
            } else {
                stringMap.put(c, stringMap.get(c) + 1);
            }

        }

        int count = 0;
        for (char key: stringMap.keySet()) {
            count += stringMap.get(key) % 2;
        }

        return count <= 1;

    }

}
