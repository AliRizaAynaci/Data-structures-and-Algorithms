package data_structures.hash_table;

import java.util.LinkedList;

public class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    public HashTable() {
        this.table = new LinkedList[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Add a key-value pair to the hash table.
    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check if the key already exists in the list, and update its value if it does.
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;
    }

    // Get the value associated with a key from the hash table.
    public V get(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }

        return null;
    }

    // Remove a key-value pair from the hash table.
    public void remove(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    // Get the size (number of key-value pairs) of the hash table.
    public int size() {
        return size;
    }

    // Hash function to determine the index for a given key.
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }
}
