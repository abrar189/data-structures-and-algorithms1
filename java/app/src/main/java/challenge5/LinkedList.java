package challenge5;

public class LinkedList {

  Node head;


  public void insert(int data) {
    if (head == null) {
      Node node = new Node(data);
      head = node;
    } else {
      Node current;
      current = head;
      while (current.next != null) {
        current = current.next;
      }

      Node node = new Node(data);
      current.next = node;

    }

  }


  public boolean includes(int value) {

    Node current = head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public String toString() {
    String printList = "";
    Node current = head;
    while (current != null) {
      printList = printList + "{" + current.value + "}";

      if (current.next == null) {
        printList = printList + "NULL";
        return printList;
      }
      current = current.next;
    }
    return printList;
  }

//  public void append(int num) {
//    Node newNode = new Node(num);
//    if (head.next != null) {
//      newNode.next = head;
//    }
//    head = newNode;
//  }

  public void append1(int num) {
    Node newNode = new Node(num);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void insertBefore(int valueNode, int newNodeValue) {
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

  public void insertAfter(int valueNode, int newNodeValue) {
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

  public String kthFromEnd(int k) {
    Node current = head;
    int counter = 0;
    while (current.next != null) {
      current = current.next;
      counter++;
    }

    if (k > counter || k < 0) {
      return "Exception";
    } else {
      current = head;
      for (int i = counter; i >= counter -k; i--) {
        if (i == counter - k) {
          return "{" + current.value + "}";
        }
        current = current.next;
      }
    }
    return "Exception";
  }


  public Node zipLists(LinkedList list1, LinkedList list2) {

    if (list1.head == null) {
      return list2.head;
    } else if (list2.head == null) {
      return list1.head;
    } else {
      Node current1 = list1.head;
      Node current2 = list2.head;
      Node list1Next, list2Next;

      while (current1 != null && current2 != null) {

        list1Next = current1.next;
        list2Next = current2.next;

        current2.next = list1Next;
        current1.next = current2;

        current1 = list1Next;
        current2 = list2Next;
      }
      return list1.head;
    }
  }
  public boolean isPalindrome() {
  Node current;
  current=head;
    if(current==null || current.next==null)
      return true;
    Node node1 = head;
    Node node2 = head;
    while (node1 != null && node1.next != null) {
      node1 = node1.next.next;
      node2 = node2.next;
    }

    if (node1 != null) {
      node2 = node2.next;
    }
    node2 = reverse(node2);
    node1 = head;

    while (node2 != null) {
      if (node1.value != node2.value) {
        return false;
      }
      node1 = node1.next;
      node2 = node2.next;
    }
    return true;
  }

  public Node reverse(Node head) {
   Node prev = null;
    while (head != null) {
      Node next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}

