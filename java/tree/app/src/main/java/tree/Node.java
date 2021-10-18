package tree;



public class Node<T>{
  public T value;
  public Node next;

  public Node<T> leftChild;
  public Node<T> rightChild;

  public Node(T value, Node leftChild, Node rightChild) {
    this.value = value;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }
  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(Node leftChild) {
    this.leftChild = leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public void setRightChild(Node rightChild) {
    this.rightChild = rightChild;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", leftChild=" + leftChild +
      ", rightChild=" + rightChild +
      '}';
  }
}
