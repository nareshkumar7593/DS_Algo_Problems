package SortingProblems;

public class SelectionSort {

  public static void main(String[] args) {

    int[] arr = {44, 11, 18, 33, 21, 67, 99, 103, 11, 42, 61, 88};
    int index = 0, temp =0;
    for(int i =0; i<arr.length; i++){
      int min = arr[i];
      for(int j = i+1; j <arr.length; j++){
        if(arr[j] < min) {
          min = arr[j];
          index = j;
        }
      }
      if(arr[i] > arr[index]) {
        temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
      }
    }

    for(int sortedArr : arr)
      System.out.print(sortedArr+", ");
  }
}
