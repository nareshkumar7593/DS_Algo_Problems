package com.company;

import java.util.Scanner;

public class InterpolationSearch {

  public static void main(String[] args) {
    int[] arr = {1, 3, 7, 12, 16, 19, 25, 28, 33, 55, 77,91};
    Scanner inputReader = new Scanner(System.in);
    int inputValue = inputReader.nextInt();
    int low = 0, high = arr.length - 1;
    int pos = low + ((inputValue - arr[low]) * (high - low))/(arr[high]-arr[low]);

    while(low <= high && arr[low]<= inputValue && arr[high]>=inputValue ){
      if(arr[pos] == inputValue) {
        System.out.println("The Element is in position : " + pos);
        break;
      }
      else if(arr[pos] > inputValue) {
        high = pos - 1;
        pos = low + ((inputValue - arr[low]) * (high - low)) / (arr[high] - arr[low]);
      }
      else {
        low = pos + 1;
        pos = low + ((inputValue - arr[low]) * (high - low)) / (arr[high] - arr[low]);
      }
    }
  }
}
