/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.Queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
      stackDemo();
      queueDemo();
    }

  private static void stackDemo() {
    Stack stack = new Stack();

    stack.push("A");
    stack.push("B");
    stack.push("R");
    stack.push("A");
    stack.push("R");

    System.out.println("The top of the stack is => " + stack.peek());

    System.out.println(stack.pop());

    System.out.println("The top of the stack is => " + stack.peek());

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }

  private static void queueDemo() {
    Queue queue = new Queue();

    queue.enqueue("A");
    queue.enqueue("B");
    queue.enqueue("R");
    queue.enqueue("A");
    queue.enqueue("R");

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println("The front of the Queue is => " + queue.peek());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
  }
}
