package SortingProblems;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {44, 33, 21, 67, 99, 103, 11, 42, 61, 88};
   for(int i =1; i<arr.length; i++){
     int key = arr[i];
     int j = i - 1;
      while(j >=0 && arr[j] > key){
       arr[j+1] = arr[j];
       j = j-1;
     }
    arr[j+1] = key;
   }
    for(int sortArr : arr){
      System.out.println(sortArr);
    }
  }
}
