package stack.and.Queue;

public class Node {
  String data;
  Node next;


  public Node(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data='" + data + '\'' +
      '}';
  }


}
