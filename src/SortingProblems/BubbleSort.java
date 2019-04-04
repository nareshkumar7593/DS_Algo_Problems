package SortingProblems;

public class BubbleSort {

  public static void main(String[] args) {

    int[] arr = {44, 11, 18, 33, 21, 67, 99, 103, 11, 42, 61, 88};
    int temp = 0;
    boolean flag = true;
    while(flag == true) {
      flag = false;
      for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
          temp = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = temp;
          flag = true;
        }
      }
    }

    for(int sortedArr : arr)
      System.out.print(sortedArr+ ", ");

  }
}
