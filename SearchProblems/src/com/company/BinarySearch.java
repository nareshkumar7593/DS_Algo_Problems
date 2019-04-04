package com.company;

import java.util.Scanner;

public class BinarySearch {

  static int[] arr = {1, 3, 7, 12, 16, 19, 25, 28, 33, 55, 77,91};

//  Scanner inputReader = new Scanner(System.in);
  static int inputValue = 91;

  public static void binary(int intialSize, int finalSize, int[] arr){

    if(arr[(intialSize +finalSize)/2] == inputValue){
      System.out.println("The element is found in Index :"+ (intialSize +finalSize)/2);
    }
    else {
      if (arr[(intialSize +finalSize)/2] > inputValue)
        binary(intialSize, (intialSize + finalSize)/2 -1 , arr);

      if (arr[(intialSize +finalSize)/2] < inputValue)
        binary((intialSize + finalSize)/2 + 1, finalSize, arr);
    }
  }

  public static void main(String[] args) {

    binary(0,arr.length -1, arr);
  }
}
