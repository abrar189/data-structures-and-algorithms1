package treeIntersection;

public class Node<V> {

  public V value;
  public Node left;
  public Node right;

  public Node() {}

  public Node(V value) {
    this.value = value;
  }

  public Node(V value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

}
