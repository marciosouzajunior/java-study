public class MyHashTable {

    public static void main(String[] args) {

        HashTable hashTable = new HashTable();

        hashTable.insert("Marcio", 1);
        hashTable.insert("Juliana", 2);
        hashTable.insert("Gabriel", 3);
        hashTable.insert("Julia", 4);

        System.out.println("Julia value is " + hashTable.get("Julia"));
        System.out.println("Test value is " + hashTable.get("Test"));

    }


}

class HashTable {

    Integer[] hashTable = new Integer[100];

    public void insert(String key, Integer value) {
        int index = Math.abs(key.hashCode()) % 100;
        hashTable[index] = value;
    }

    public Integer get(String key) {
        int index = Math.abs(key.hashCode()) % 100;
        return hashTable[index];
    }

}