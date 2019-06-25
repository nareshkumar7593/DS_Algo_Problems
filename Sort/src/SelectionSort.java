public class SelectionSort {
  public static void main(String[] args) {
    int[] unsortedVal = {3,3,100,1,6,8,0,3,2};
    int n = unsortedVal.length;
    int k = 0, j =0;

    for(int i = 0; i<n-1; i++){
      for(j = k = i; j<n;j++){
        if(unsortedVal[k] > unsortedVal[j]){
          k = j;
        }
      }
      int temp = unsortedVal[i];
      unsortedVal[i] = unsortedVal[k];
      unsortedVal[k] = temp;
    }

    for(int num : unsortedVal)
      System.out.println(num);
  }
}


