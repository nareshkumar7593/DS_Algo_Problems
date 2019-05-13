import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeightOfTree {
  Node root;

  static class Node {
    int key;
    Node left, right;

    Node(int keyValue) {
      key = keyValue;
      left = null;
      right = null;
    }
  }

  public static void main(String[] args) {
    HeightOfTree tree = new HeightOfTree();

//    tree.root = new Node(5);
//    tree.root.left = new Node(3);
//    tree.root.right = new Node(7);
//    tree.root.left.left = new Node(2);
//    tree.root.left.right = new Node(4);
//    tree.root.right.left = new Node(6);
//    tree.root.right.right = new Node(8);

    tree.root = new Node(3);
    tree.root.left = new Node(2);
    tree.root.right = new Node(5);
    tree.root.left.left = new Node(1);
    tree.root.right.left = new Node(4);
    tree.root.right.right = new Node(6);
    tree.root.right.right.right = new Node(7);

    //int count = countOfNodes(tree.root);
    //int sum = sum(tree.root);
    //int degree2Count = degreeTwoCount(tree.root);
    int height = heightOfTree(tree.root);
    System.out.println(height);
  }

  private static int degreeTwoCount(Node root) {
    int x = 0, y = 0;
    if (root != null) {
      x = degreeTwoCount(root.left);
      y = degreeTwoCount(root.left);
      if (root.left != null && root.right != null)
        return x + y + 1;
      else
        return x + y;
    }
    return 0;
  }

  public static int countOfNodes(Node root) {
    int x = 0, y = 0;
    if (root != null) {
      x = countOfNodes(root.left);
      y = countOfNodes(root.right);
      return x + y + 1;
    }
    return 0;
  }

  public static int sum(Node root) {
    int x = 0, y = 0, sum = 0;
    if (root != null) {
      x = sum(root.left);
      y = sum(root.right);
      return x + y + root.key;
    }
    return 0;
  }

  public static int heightOfTree(Node root) {
    int x = 0, y = 0;
    if (root != null) {
      x = heightOfTree(root.left);
      y = heightOfTree(root.right);
      if (x > y)
        return x + 1;
      else
        return y + 1;
    }
    return 0;
  }
}
