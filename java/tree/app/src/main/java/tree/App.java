/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

      BinarySearchTree<Integer> binarySearchTree=new BinarySearchTree<>();
      binarySearchTree.insert(6);
      binarySearchTree.insert(2);
      binarySearchTree.insert(4);
      binarySearchTree.insert(10);
      binarySearchTree.insert(3);
      binarySearchTree.insert(8);

      System.out.println("Inorder");
      binarySearchTree.inorderTraversal();

      System.out.println("\n----------Preorder ----------");
      binarySearchTree.preorderTraversal();
      System.out.println("\n---------- Postorder ---------");
      binarySearchTree.postorderTraversal();
      System.out.println("\n");
      System.out.println(binarySearchTree.contains(10));
    }

}
