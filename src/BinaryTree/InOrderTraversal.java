package BinaryTree;

public class InOrderTraversal {

  static class Node{
    int key;
    Node left, right;

    Node(int key){
     this.key = key;
     left = null;
     right = null;
    }
  }

  static Node root;

  private static void InOrder(Node temp) {

    if(temp == null)
      return;

    InOrder(temp.left);
    System.out.print(temp.key +" ");
    InOrder(temp.right);
  }

  private static void PreOrder(Node temp) {

    if(temp == null)
      return;

    System.out.print(temp.key+ " ");
    PreOrder(temp.left);
    PreOrder(temp.right);
  }

  private static void PostOrder(Node temp) {

    if(temp == null)
      return;

    PostOrder(temp.left);
    PostOrder(temp.right);
    System.out.print(temp.key+ " ");
  }

  public static void main(String[] args) {

//    root = new Node(10);
//    root.left = new Node(11);
//    root.right = new Node(9);
//    root.left.left = new Node(7);
//    root.right.left = new Node(15);
//    root.right.right = new Node(8);

    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    
    System.out.println("Inorder Traversal : ");
    InOrder(root);

    System.out.println("Preorder Traversal : ");
    PreOrder(root);

    System.out.println("Postorder Traversal : ");
    PostOrder(root);
  }


}
