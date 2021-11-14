package challenge5;

public class Node {
  int value ;
  Node next;


  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node(int num){
    this.value=num;
  }


}
