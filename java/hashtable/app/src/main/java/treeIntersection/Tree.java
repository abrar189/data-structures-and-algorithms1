package treeIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tree {

  public static ArrayList treeIntersection(BinaryTree tree1, BinaryTree tree2) {
    if (tree1.root == null || tree2.root == null) return null;
    Map<String,String> storeMap = new HashMap();
    ArrayList<Object> arr = new ArrayList<>();
    for (Object value : tree1.preOrder(tree1.root)) {
      storeMap.put(value.toString(), null);
    }
    for (Object value: tree2.preOrder(tree2.root)) {
      if (storeMap.containsKey(value.toString()) && !arr.contains(value)) arr.add(value);
    }
    return arr;
  }
}
