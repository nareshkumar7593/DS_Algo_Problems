package com.company;

import java.util.Scanner;

public class JumpSearch {

  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    int inputValue = inputReader.nextInt();

    int[] arr = {1, 3, 7, 12, 16, 19, 25, 28, 33, 55, 77,91};

    int jumpValue = (int)Math.sqrt(arr.length);
    int prev = 0;
    while(arr[Math.min(jumpValue,arr.length - 1)] < inputValue){
      prev = jumpValue;
      jumpValue += (int)Math.sqrt(arr.length);
    }
    for(int i = prev; i<arr.length; i++){
      if(arr[i] == inputValue) {
        System.out.println("The Element is found in index: " + i);
        break;
      }
    }

  }
}
