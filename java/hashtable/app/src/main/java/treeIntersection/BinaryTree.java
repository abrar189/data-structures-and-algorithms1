package treeIntersection;

import java.util.ArrayList;

public class BinaryTree<V> {

  public ArrayList<V> preOrderList = new ArrayList<>();
  public Node<V> root;

  public BinaryTree() {}

  public BinaryTree(Node<V> root) {
    this.root = root;
  }

  public ArrayList<V> preOrder(Node<V> root) {
    try {
      preOrderList.add(root.value);
      if (root.left != null) preOrder(root.left);
      if (root.right != null) preOrder(root.right);
    } catch (NullPointerException exception) {
      System.out.println(exception.getMessage());
    }
    return preOrderList;
  }

  @Override
  public String toString() {
    if (preOrderList.isEmpty()) return "Empty List";
    return "preOrderList=" + preOrderList;
  }
}
