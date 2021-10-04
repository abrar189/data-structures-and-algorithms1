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
      printList =  "{"+current.value +"}"  +printList;

      if (current.next == null) {
        printList = printList + "NULL";
        return printList;
      }
      current = current.next;
    }
    return printList;
  }

   public void append(int num){
    Node newNode= new Node(num);
    if (head.next != null){
      newNode.next=head;
    }
    head=newNode;
  }

  public void insertAfter(int valueNode, int newNodeValue) {
    Node newNode = new Node(newNodeValue);
    if (head == null) {
      head = newNode;
    } else if (head.value == valueNode) {
      insert(newNodeValue);
    } else {
      Node current = head;
      while (current.next != null) {
        if (current.next.value == valueNode) {
          newNode.next = current.next;
          current.next = newNode;
          break;
        }
        current = current.next;
      }
    }
  }

  public void insertBefore(int valueNode, int newNodeValue) {
    Node newInsertNode = new Node(newNodeValue);
    if (head == null) {
      head = newInsertNode;
    } else {
      Node current = head;
      while (current != null) {
        if (current.value == valueNode) {
          newInsertNode.next = current.next;
          current.next = newInsertNode;
        }
        current = current.next;
      }
    }

  }
}
