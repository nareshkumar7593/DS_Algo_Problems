public class BinarySearchTreeInsertion {
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
    BinarySearchTreeInsertion tree = new BinarySearchTreeInsertion();

//    tree.root = new Node(5);
//    tree.root.left = new Node(3);
//    tree.root.right = new Node(7);
//    tree.root.left.left = new Node(2);
//    tree.root.left.right = new Node(4);
//    tree.root.right.left = new Node(6);
//    tree.root.right.right = new Node(8);

    tree.root = new Node(4);
    tree.root.left = new Node(2);
    tree.root.right = new Node(7);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(3);

    int numToBeInserted = 6;
    nodeInsertion(tree.root,numToBeInserted);
    inOrder(tree.root);
  }

  private static void nodeInsertion(Node root, int num) {
    Node current = root;

    while(current.left != null && current.right != null){
      if(current.key < num){
        current = current.right;
      }
      else {
        current = current.left;
      }
    }
    Node newNode = new Node(num);
    if(current.key < newNode.key)
      current.right = newNode;
    else
      current.left = newNode;

  }

  public static void inOrder(Node root){

    if(root == null)
      return;
    inOrder(root.left);
    System.out.println(root.key);
    inOrder(root.right);

  }

}
