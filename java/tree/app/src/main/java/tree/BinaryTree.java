package tree;

import java.util.ArrayList;

public class BinaryTree<T> {

  ArrayList <Object> breadthFirstArr=new ArrayList<>();

  public ArrayList breadthFirst(Node root){
    if (root!=null){

      Queue<Node> queue=new Queue();
      queue.enqueue(root);
      while (queue.peek()!=null){
        Node front=  queue.dequeue();
        breadthFirstArr.add(front.getValue());
        if (front.getLeftChild() !=null)
          queue.enqueue(front.getLeftChild());
        if (front.getRightChild() !=null)
          queue.enqueue(front.getRightChild());

      }
      return breadthFirstArr;
    }
    else return null;
  }

}