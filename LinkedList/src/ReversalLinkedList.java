public class ReversalLinkedList {

  Node head;

  static class Node{
    int data;
    Node next;

    Node(int value){data = value; next=null;}
  }

  public static void main(String[] args) {
    ReversalLinkedList rll = new ReversalLinkedList();

    Node n1 = new Node(5);
    Node n2 = new Node(10);
    Node n3 = new Node(15);
    Node n4 = new Node(20);
    Node n5 = new Node(25);

    rll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    reversingNode(rll.head);

  }

  private static void reversingNode(Node head) {

    Node prevPtr = null;
    Node curr = head;
    Node nextPtr = null;

    while (curr != null) {
      nextPtr = curr.next;
      curr.next = prevPtr;

      prevPtr = curr;
      curr = nextPtr;

    }
    head = prevPtr;

    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
  }
}
