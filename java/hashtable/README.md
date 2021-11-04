# Hashtables

Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.

## Challenge

### Implement a Hashtable Class with the following methods:

- add
Arguments: key, value
Returns: nothing
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

- get
Arguments: key
Returns: Value associated with that key in the table

- contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.

- hash
Arguments: key
Returns: Index in the collection for that key

## Approach & Efficiency

- Time : if the bucket has no collisions, Hash tables are O(1) average. this is the perfect hashing.

but however it suffers from O(n) in the collisions cases.

- Space: complexity of O(n).
-
[link of code](https://github.com/abrar189/data-structures-and-algorithms1/tree/hashtable/java/hashtable/app/src)
