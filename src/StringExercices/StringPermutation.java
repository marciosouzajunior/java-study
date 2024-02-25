package StringExercices;

import java.util.HashMap;

public class StringPermutation {


    public static void main(String[] args) {

        StringPermutation sp = new StringPermutation();
        boolean result = sp.checkPermutation("AABC", "ACAB");
        System.out.println("Is permutation: " + result);
        result = sp.checkPermutation("AABC", "ACAA");
        System.out.println("Is permutation: " + result);

    }

    boolean checkPermutation(String str1, String str2){

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // add from str1 to map1
        for (char c : str1.toCharArray()){
            if (map1.get(c) == null) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }

        // add from str2 to map1
        for (char c : str2.toCharArray()){
            if (map2.get(c) == null) {
                map2.put(c, 1);
            } else {
                map2.put(c, map2.get(c) + 1);
            }
        }

        for(char c : map1.keySet()){

            // check if char exists
            if (map2.get(c) == null){
                return false;
            }

            // check if value is same
            if (map1.get(c) != map2.get(c)){
                return false;
            }

        }

        return true;

    }

}
