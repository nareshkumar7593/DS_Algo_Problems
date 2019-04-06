package SortingProblems;

import java.util.Scanner;

public class HeapInsertion {

  public static void main(String[] args) {
  int[] arr = {50, 30, 20, 15, 10, 8, 16};

  int[] newArr = new int[arr.length + 1];

  Scanner inputReader = new Scanner(System.in);
  int inputValue = inputReader.nextInt();
  
  insertion(inputValue,arr, newArr);

  for(int elementsAfterInsertion : newArr)
    System.out.println(elementsAfterInsertion);
  }

  private static void insertion(int inputValue, int[] arr, int[] newArr) {

    for(int i = 0; i<arr.length;i++){
      newArr[i] = arr[i];
    }
    newArr[newArr.length - 1] = inputValue;

    int i = newArr.length - 1;

    while(newArr[i/2] < newArr[i]){
      int temp = newArr[i/2];
      newArr[i/2] = newArr[i];
      newArr[i] = temp;

      i = i/2;
    }
  }
}