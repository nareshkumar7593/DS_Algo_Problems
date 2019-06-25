public class InsertionSort {
  public static void main(String[] args) {
    int[] unsortedVal = {3,3,100,1,6,8,0,3,2};
    int n = unsortedVal.length;

  for(int i = 1; i<n;i++){
      int j = i -1;
      int temp = unsortedVal[i];
      while(j>= 0 && unsortedVal[j] > temp){
        unsortedVal[j+1] = unsortedVal[j];
        j--;
      }
    unsortedVal[j+1] = temp;
  }

    for(int num : unsortedVal)
      System.out.println(num);
  }
}
