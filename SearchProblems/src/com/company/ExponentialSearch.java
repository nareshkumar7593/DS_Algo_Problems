package com.company;

import java.util.Scanner;


public class ExponentialSearch {
  public void main(String[] args) {
    int[] arr = {1, 3, 7, 12, 16, 19, 25, 28, 33, 55, 77,91};

    Scanner inputReader = new Scanner(System.in);
    int inputValue = inputReader.nextInt();
    int i =0;
    if(arr[i] == inputValue)
      System.out.println("The Index Value is 0");
    while(i<arr.length - 1 && arr[i] <= inputValue)
      i = i*2;

    binarySearch(arr,i/2,Math.min(i,arr.length-1),inputValue);
  }

  public static void binarySearch(int[] arr, int low, int high, int searchValue){
    if(arr[(low+high)/2]==searchValue)
      System.out.println("The element is in index position:"+(low+high)/2);
    else{
      if(arr[(low+high)/2] > searchValue)
        binarySearch(arr,low,(low+high)/2 - 1, searchValue);
      if(arr[(low+high)/2] < searchValue)
        binarySearch(arr,(low+high)/2 + 1,high, searchValue);
    }
  }
}
