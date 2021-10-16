package challengs;



public class AnimalShelter<T> extends Queue<T> {


public class AnimalShelter<T> {
  protected Node <T> front;
  protected Node<T> rear;


  public AnimalShelter() {
    this.front = null;
    this.rear = null;
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node<>(value);
    if (this.front == null) {
      this.front = newNode;
      this.rear = newNode;
    } else {
      this.rear.next = newNode;
      this.rear = newNode;
    }
  }


  public T dequeue(String animalType) {
    Node previous = this.front;
    Node current = this.front;

    while (current != null) {
      if (current.data.toString() == animalType) {
        if (current == previous && current.next == null) {
          this.front = null;
          this.rear = null;
        } else if (current == previous && current.next != null) {
          this.front = this.front.next;
        } else if (current == this.rear) {
          this.rear = previous;
        }
        if (current != previous) {
          previous.next = previous.next.next;
        }
        return  current.data;
      }
      if (previous != current) {
        previous = previous.next;
      }
      current = current.next;
    }
    return null;
  }

  public T peek() {
    return this.front != null ? this.front.data : null;
  }

}
