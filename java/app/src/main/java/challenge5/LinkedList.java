package challenge5;

public class LinkedList {

  Node head;


  public void insert(int num) {
    Node newNode = new Node(num);
    if (head != null) {
      newNode.next = head;

    }
    head = newNode;
  }


  public boolean includes(int value) {

    Node current = head;
    while(current != null){
      if (current.value == value){
        return true;
      }
      current=current.next;
    }
    return false;
  }

  public  String toString(){
    String printList = "";
    Node current = head;
    while (current!= null) {
      printList = printList + "{ " + current.value + " } -> ";
      if (current.next == null) {
        printList = printList + "NULL";
        return printList;
      }
      current = current.next;
    }
    return printList;
  }
}
