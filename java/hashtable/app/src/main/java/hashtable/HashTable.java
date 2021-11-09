package hashtable;

import treeIntersection.BinaryTree;

import java.util.*;

public class HashTable<K, V> {

  public ArrayList<HashNode<K, V>> bucketArray;
  private int numBuckets;
  public int size;
  public HashTable() {
    bucketArray = new ArrayList<>();
    numBuckets = 10;
    size = 0;

    for (int index = 0; index < numBuckets; index++) {
      bucketArray.add(null);
    }
  }
  private int hashCode(K key) {
    return Objects.hashCode(key);
  }

  private int getBucketIndex(K key) {
    int hashCode = hashCode(key);
    int index = hashCode % numBuckets;
    index = index < 0 ? index * -1 : index;
    return index;
  }


  public void add(K key, V value) {

    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        head.value = value;
        return;
      }
      head = head.next;
    }


    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);

    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;

      for (int index = 0; index < numBuckets; index++) {
        bucketArray.add(null);
      }

      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }

  public V get(K key) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);

    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        return head.value;
      }
      head = head.next;
    }
    return null;
  }
  public int hash(K key) {
    int idx = 0;
    char[] charArr = key.toString().toCharArray();
    for (int oneChar : charArr) {
      idx += oneChar;
    }
    return idx % bucketArray.toArray().length;
  }

  public boolean contains(K key) {
    int idx = hash(key);
    if (bucketArray.get(idx) == null) return false;
    if (key == bucketArray.get(idx).key) return true;
    HashNode<K, V> current = bucketArray.get(idx);
    while (current != null) {
      if (key == current.key) return true;
      current = current.next;
    }
    return false;
  }

  public static String repeatedWord(String string) {
    Map<String, String> hashMap = new HashMap<>();
//    String[] words = string.split(" ");
    String[] words = string.toLowerCase()
      .replaceAll("[^a-z ]", "")
      .split(" ");
    for (String word : words) {
      word = word.toLowerCase();

      if (hashMap.containsKey(word)) return word;
      else hashMap.put(word, word);
    }
    return "NO REPEATED WORDS";
  }

  public static HashMap<String, String> hashMapLeftJoinFun(HashMap<String, String> hashMapOne, HashMap<String, String> hashMapTow){
    HashMap<String,String> result=new HashMap<>();

    for (String hashMapOneKeys :hashMapOne.keySet()) {
      if (hashMapTow.containsKey(hashMapOneKeys)) {
        String value=" "+(hashMapOne.get(hashMapOneKeys)+","+hashMapTow.get(hashMapOneKeys)+" ");
        result.put(hashMapOneKeys,value);

      }else {
        String value2=" "+(hashMapOne.get(hashMapOneKeys)+",null ");
        result.put(hashMapOneKeys,value2);
      }
    }
    return result;
  }
}
