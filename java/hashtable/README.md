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


# challenge 31 :


## Challenge Summary

write a method that take string and Find the first repeated word in the string

## Whiteboard Process

![image](./img/ch31.PNG)

## Approach & Efficiency

- time : O(n) because we have for loop  (we have n of elements)
- space : O(n)  we make addition space for declare array



# challenge 32 :


## Challenge Summary

write a method that accept two binary trees and return array have all values  found to be in the two binary trees

## Whiteboard Process

![image](./img/ch32.PNG)

## Approach & Efficiency

- time : O(n) because we have for loop
- space : O(n)  we make addition space for declare array and hash map



# challenge 33 :


## Challenge Summary

Write a function called left join Arguments: two hash maps The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values. The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values. and return hashMap

## Whiteboard Process

![image](./img/ch33.PNG)

## Approach & Efficiency

- time : O(n) because we have for loop
- space : O(n)  we make addition space for declare hash map
