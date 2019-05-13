public class BinaryTreeTraversal {
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
    BinaryTreeTraversal tree = new BinaryTreeTraversal();

    tree.root = new Node(5);
    tree.root.left = new Node(3);
    tree.root.right = new Node(7);
    tree.root.left.left = new Node(2);
    tree.root.left.right = new Node(4);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(8);

    //preOrder(tree.root);
    inOrder(tree.root);
  }

  public static void preOrder(Node root){

    if(root == null)
     return;
    System.out.println(root.key);
    inOrder(root.left);
    inOrder(root.right);

  }
  public static void inOrder(Node root){

    if(root == null)
      return;
    inOrder(root.left);
    System.out.println(root.key);
    inOrder(root.right);

  }

}
