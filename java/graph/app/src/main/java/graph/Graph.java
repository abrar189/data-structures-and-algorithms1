package graph;

import java.util.*;

public class Graph <T>{

  public Map< Node<T> , List<Node<T>>> hashList = new HashMap<>();

  public Graph() {}

  public Node<T> addNode(T value) {
    Node<T> newNode = new Node<T>(value);
    hashList.put(newNode, new ArrayList<>());
    return newNode;
  }

  public void addEdge(T value1, T value2) {
    Node<T> node1 = new Node<T>(value1);
    Node<T> node2 = new Node<T>(value2);

    hashList.get(node1).add(node2);
    hashList.get(node2).add(node1);

  }

  public Set<Node<T>> getNodes() {
    return hashList.keySet();
  }

  public List<Node<T>> getNeighbors(T value) {
    return hashList.get(new Node<T>(value));
  }

  public int size() {
    return hashList.size();
  }

  @Override
  public String toString() {
    if (hashList.isEmpty()) return null;
    return "" + hashList;
  }
}
