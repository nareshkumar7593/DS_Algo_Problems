import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
  Node root;

  static class Node {
    int key;
    Node left, right;

    Node(int keyValue) {
      key = keyValue;
      left = null; right = null;
    }
  }

  public static void main(String[] args) {
    LevelOrderTraversal tree = new LevelOrderTraversal();

    tree.root = new Node(5);
    tree.root.left = new Node(3);
    tree.root.right = new Node(7);
    tree.root.left.left = new Node(2);
    tree.root.left.right = new Node(4);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(8);
    Queue<Node> queueNode = new LinkedList<>();
    levelOrderTraversal(tree.root, queueNode);

  }

  private static void levelOrderTraversal(Node root, Queue<Node> queueNode) {
    Node curr = root;
    queueNode.add(curr);
    while(!queueNode.isEmpty() && curr!=null) {
      System.out.print(curr.key);
      if(curr.left != null)
        queueNode.add(curr.left);
      if(curr.right != null)
        queueNode.add(curr.right);
      queueNode.remove();
      curr = queueNode.peek();
    }
  }

}
