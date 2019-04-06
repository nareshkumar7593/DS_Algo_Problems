package SortingProblems;

public class HeapDeletion {
  public static void main(String[] args) {
    int[] arr = {50, 30, 20, 15, 10, 8, 16};

    int[] newArr = new int[arr.length - 1];

    deletion(arr, newArr);

    for(int valueAfterDeletion : newArr)
      System.out.println(valueAfterDeletion);
  }

  private static void deletion(int[] arr, int[] newArr) {
    arr[0] = arr[arr.length - 1];

    for(int i =0; i<arr.length - 1; i++){
      newArr[i] = arr[i];
    }

    int j = 1;
    while(newArr[j - 1] < newArr[(2*j)-1] && newArr[j-1] < newArr[(2*j)] && 2*j < newArr.length){
      if(newArr[(2*j)-1] > newArr[(2*j)]){
        int temp = newArr[(2*j)-1];
        newArr[(2*j)-1] = newArr[j-1];
        newArr[j-1] = temp;

        j = j * 2;
      }
      if(newArr[(2*j)-1] < newArr[(2*j)]){
        int temp = newArr[(2*j)];
        newArr[(2*j)] = newArr[j-1];
        newArr[j-1] = temp;

        j = (j * 2)+1;
      }

    }
  }

}
