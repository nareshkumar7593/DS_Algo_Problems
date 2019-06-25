public class BubbleSort {
  public static void main(String[] args) {
    //int[] unsortedVal = {3,3,100,1,6,8,0,3,2};
    int[] unsortedVal = {2,3,4,5,16,7,8,9};
    int n = unsortedVal.length;

    for(int i =0; i<n-1; i++){
      boolean flag = true;
      for(int j = 0; j< n-1-i; j++){
        if(unsortedVal[j] > unsortedVal[j+1]){
          int temp = unsortedVal[j];
          unsortedVal[j] = unsortedVal[j+1];
          unsortedVal[j+1] = temp;
          flag = false;
        }
      }
      if(flag)
        break;
    }

    for(int num : unsortedVal)
      System.out.println(num);
  }
}
