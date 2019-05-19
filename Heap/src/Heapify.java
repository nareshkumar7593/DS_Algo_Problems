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
