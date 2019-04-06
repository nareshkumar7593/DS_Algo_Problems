package SortingProblems;

public class Heapify {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 7, 8, 9, 10, 14, 16  };

    int n  = arr.length;

    for(int i = arr.length/2 - 1; i>=0; i-- ){
      heapify(arr, n ,i);
    }

    for(int heapifiedArr : arr){
      System.out.println(heapifiedArr + " ");
    }
  }

  private static void heapify(int[] arr, int n, int i) {
    int largest = i;

    int l = 2 * i + 1;
    int r = 2 * i + 2;

    if((l < n) && (arr[l] > arr[largest]))
      largest = l;

    if((r < n) && (arr[r] > arr[largest]))
      largest = r;

    if(largest != i){
      int temp = arr[i];
      arr[i]= arr[largest];
      arr[largest] = temp;

      heapify(arr, n, largest);
    }

  }
}
