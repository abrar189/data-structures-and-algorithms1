/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge5;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

    LinkedList list = new LinkedList();
    list.insert(8);
    list.insert(5);
    list.insert(3);
    list.insert(1);


list.append(6);
list.insertBefore(3,9);
list.insertAfter(5,7);
    System.out.println(list.includes(9));
    System.out.println(list.toString());
}
}
