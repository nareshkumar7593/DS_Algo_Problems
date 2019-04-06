public class QuickSort{


  public static void main(String[] args) {
    int[] arr = {44, 11, 18, 33, 21, 67, 99, 103, 11, 42, 61, 88};
    quickSort(arr, 0, arr.length - 1);

    for(int sortedElements : arr)
      System.out.println(sortedElements);

  }

  private static void quickSort(int[] arr, int l, int h) {

    if(l < h){
      int p = partition(arr,l, h);
      quickSort(arr,l, p-1);
      quickSort(arr,p,h);

    }
  }

  private static int partition(int[] arr, int l, int h) {
    int pivot = arr[l];
    while(l <= h){
      while(arr[l] < pivot)
        l++;
      while (arr[h] > pivot)
        h--;
      if(l <= h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
        l++;
        h--;
      }
    }
    return l;
  }
}