package challengs;

public class Queue<T> {

  public Node<T> front;
  public Node<T> rear;
  private Node<T> top;

  public Node<T> getTop() {
    return top;
  }

  public void setTop(Node<T> top) {
    this.top = top;
  }

  public Queue() {
  }

  public void enqueue(T data) {
    if (isEmpty()) {
      Node<T> node = new Node<>(data);
      front = node;
      rear = node;
    } else {
      Node<T> node = new Node<>(data);
      rear.setNext(node);
      rear = node;
    }
  }
  public T dequeue() {
    T data;
    if (isEmpty()) {
      return (T) "Queue is empty";
    } else {
       data = (T) front.getData();
      front = front.getNext();
      return data;
    }
  }
  public T peek() {
    return (T) front.getData();
  }
  public boolean isEmpty() {
    return front == null;
  }


}
