package tree;

public class BinarySearchTree<T extends Comparable<T>> {
  private Node<T> root;

  public  void insert(T data) {
    if (isEmpty()) {
      root = new Node<>(data);
    } else {
      insertHelper(data, root);
    }
  }

  public void inorderTraversal() {
    if (isEmpty()) {
      return ;
    }
    traverseInorder(root);
  }

  private void traverseInorder(Node<T> root) {
    if (root.getLeftChild() != null) {
      traverseInorder(root.getLeftChild());
    }
    System.out.print(root.getValue() + " -> ");
    if (root.getRightChild() != null) {
      traverseInorder(root.getRightChild());
    }
  }

  public void preorderTraversal() {
    if (isEmpty()) {
      return;
    }
    preOrder(root);
  }
  public void preOrder( Node<T> node) {
    if (node == null) {
      return;
    }

    System.out.printf( node.getValue() +" -> ");
    preOrder(node.getLeftChild());
    preOrder(node.getRightChild());
  }

  public void postorderTraversal() {
    if (isEmpty()) {
      return;
    }

    postOrder(root);
  }
  public void postOrder( Node<T> node) {
    if (node == null) {
      return;
    }
    preOrder(node.getLeftChild());
    preOrder(node.getRightChild());
    System.out.printf( node.getValue() +" -> ");
  }
  public boolean contains( T data )
  {
    return contains( data, root );
  }

  private boolean contains( T data, Node<T> node )
  {
    if( node == null )
      return false;
    int searchResult = data.compareTo( node.getValue() );
    if( searchResult < 0 )
      return contains( data, node.getLeftChild() );
    else if( searchResult > 0 )
      return contains( data, node.getRightChild() );
    else
      return true;
  }

  private void insertHelper(T data, Node<T> root) {
    Node<T> node = new Node<>(data);
    if (data.compareTo(root.getValue()) < 0) {
      if (root.getLeftChild() == null) {
        root.setLeftChild(node);
      } else {
        insertHelper(data, root.getLeftChild());
      }
    } else if(data.compareTo(root.getValue()) > 0) {
      if (root.getRightChild() == null) {
        root.setRightChild(node);
      } else {
        insertHelper(data, root.getRightChild());
      }
    }
  }

  public boolean isEmpty() {
    return root == null;
  }
}
