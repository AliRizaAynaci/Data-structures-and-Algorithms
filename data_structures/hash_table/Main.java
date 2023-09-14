package data_structures.hash_table;

public class Main {

    public static void main(String[] args) {
        // Create a new hash table with string keys and integer values
        HashTable<String, Integer> hashTable = new HashTable<>();

        // Put key-value pairs into the hash table
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        // Display the size of the hash table
        System.out.println("Size: " + hashTable.size());

        // Retrieve and display values associated with specific keys
        System.out.println("one: " + hashTable.get("one"));
        System.out.println("two: " + hashTable.get("two"));
        System.out.println("three: " + hashTable.get("three"));

        // Remove a key-value pair from the hash table
        hashTable.remove("two");

        // Display the size of the hash table after removing 'two'
        System.out.println("Size after removing 'two': " + hashTable.size());

        // Attempt to retrieve the value associated with 'two' (which was removed)
        // It should print 'null' since the key is no longer present
        System.out.println("two: " + hashTable.get("two"));

        System.out.println("Size: " + hashTable.size());
    }
}
