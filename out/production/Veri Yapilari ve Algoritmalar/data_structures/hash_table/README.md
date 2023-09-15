# Hash Table Class

The `HashTable` class is an implementation of a basic hash table in Java, allowing you to store key-value pairs. It uses a linked list to handle collisions. This class provides methods for adding key-value pairs, retrieving values by key, removing key-value pairs, and getting the size of the hash table.

## Class Structure

The `HashTable` class has the following components:

- `table`: An array of linked lists used to store key-value pairs.
- `size`: An integer representing the number of key-value pairs in the hash table.

## Functions

### `HashTable()`

Constructor: Initializes an empty hash table with a default capacity of 10.

### `put(K key, V value)`

Adds a key-value pair to the hash table. If the key already exists, it updates the associated value.

### `get(K key) -> V`

Retrieves the value associated with a given key from the hash table. Returns `null` if the key is not found.

### `remove(K key)`

Removes a key-value pair from the hash table based on the provided key.

### `size() -> int`

Returns the number of key-value pairs in the hash table.

### `hash(K key) -> int`

Private helper function: Computes the hash code for a given key and determines the index in the array for storage.

## Usage Example

```java
// Create a new hash table
HashTable<String, Integer> hashTable = new HashTable<>();

// Add key-value pairs to the hash table
hashTable.put("one", 1);
hashTable.put("two", 2);
hashTable.put("three", 3);

// Retrieve values by key
int value = hashTable.get("two"); // Should return 2

// Remove a key-value pair
hashTable.remove("one");

// Get the current size of the hash table
int size = hashTable.size(); // Should return 2

// Attempt to retrieve a non-existent key
int missingValue = hashTable.get("four"); // Should return null
