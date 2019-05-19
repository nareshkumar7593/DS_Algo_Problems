import java.util.Scanner;

public class Heapify {

  public static void main(String[] args) {
    System.out.println("Enter the number of elements to be inserted");
    Scanner inputReader = new Scanner(System.in);
    int n = inputReader.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<n;i++){
      int value = inputReader.nextInt();
      insertion(arr,value,i);

    }
    for(int ele : arr)
    System.out.println(ele);

    System.out.println("Enter the element to be deleted");
    int toDeleteValue = inputReader.nextInt();
    deletion(arr,toDeleteValue);
    for(int i = 0; i<arr.length - 1;i++){
      System.out.println(arr[i]);
    }
  }

  private static void deletion(int[] arr, int toDeleteValue) {
    int i =0;
    for(i =0; i<arr.length;i++){
      if(arr[i] == toDeleteValue){
        break;
      }
    }
    arr[i] = arr[arr.length - 1];
    int n = arr.length - 2;
    int child1 = 2 * i + 1;
    int child2 = 2 * i + 2;
    while(child1 <= n && child2 <= n){
      if(arr[i] > arr[child1] || arr[i] > arr[child2]){
        if(arr[child1] < arr[child2]){
          int temp = arr[child1];
          arr[child1] = arr[i];
          arr[i] = temp;
          i = child1;
          child1 = 2 * i + 1;
          child2 = 2 * i + 2;
        }
        else{
          int temp = arr[child2];
          arr[child2] = arr[i];
          arr[i] = temp;
          i = child2;
          child1 = 2 * i + 1;
          child2 = 2 * i + 2;
        }
      }
      else
        break;
    }
  }

  private static void insertion(int[] arr, int value,int index) {
    if(index == 0)
      arr[index] = value;
    else{
      arr[index] = value;
      int m = index;
      int parent = 0;
      if(m % 2 != 0)
        parent = m/2;
      else
        parent = m/2 - 1;
      while(m > 0 && arr[parent] > arr[m]){ // change operator for min and max
          int temp = arr[parent];
          arr[parent] = arr[m];
          arr[m] = temp;
          m = parent;
          parent = m/2;
      }
    }
  }
}
