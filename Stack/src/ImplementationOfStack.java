import java.util.Scanner;



public class ImplementationOfStack {
  static int top = -1;

  public static void push(int[] arr, int element, int topPtr){
    if(topPtr != arr.length - 1) {
      arr[topPtr + 1] = element;
      top += 1;
    }
    else{
      System.out.println("Stack is Full");
    }
  }

  public static void pop(int[] arr, int topPtr){
    if(topPtr <= - 1) {
      System.out.println("Stack is Empty");
    }
    else{
      arr[topPtr] = 0;
      top -= 1;
    }
  }

  public static void peek(int[] arr, int index, int topPtr){
    if((topPtr - index + 1) > -1 && (topPtr - index + 1) < arr.length) {
      System.out.println(arr[topPtr - index + 1]);
    }
    else{
      System.out.println("Index out of Bounds");
    }
  }

  public static void isEmpty(int topPtr){
    if(topPtr == -1)
      System.out.println("Stack is Empty");
    else
      System.out.println("Stack is not Empty");
  }

  public static void isFull(int[] arr, int topPtr){
    if(topPtr == arr.length - 1)
      System.out.println("Stack is Full");
    else
      System.out.println("Stack is not Full");
  }



  public static void main(String[] args) {
    System.out.println("You can Perform Stack Operations");
    System.out.println("Enter the Size of the Stack");
    Scanner inputReader = new Scanner(System.in);
    int size = inputReader.nextInt();
    int[] arr = new int[size];

    System.out.println("What would you like to perform \n 1. Push \n 2. Pop \n 3. Peek \n 4. isEmpty \n 5. isFull \n 6. Quit");
    while(true){
      System.out.println("Enter your choice : ");
      int option = inputReader.nextInt();
      if(option == 1){
        System.out.println("Enter the element to be inserted");
        int ele = inputReader.nextInt();
        push(arr,ele,top);
        display(arr);
      }
      if(option == 2){
        pop(arr,top);
        display(arr);
      }
      if(option == 3){
        System.out.println("Enter the index to be view");
        int index = inputReader.nextInt();
        peek(arr,index,top);
      }
      if(option == 4){
        isEmpty(top);
      }
      if(option == 5)
        isFull(arr,top);
    }
  }

  public static void display(int[] arr){
    for(int e : arr)
      System.out.println(e);
  }
}
