package com.company;

import java.util.Scanner;

public class LinearSearch {
  static int arr[] = {10, 20, 80, 30, 60, 50,
          110, 100, 130, 170};

  public static void main(String[] args) {
    System.out.println("Enter the number to Search:");
    Scanner inputReader = new Scanner(System.in);
    int numberToSearch = inputReader.nextInt();

    int count = 0;

    for(int i = 0; i<arr.length; i++){
      if(numberToSearch == arr[i])
        break;
      else
        count++;
    }
    System.out.println("The Element is in Index : "+count);
  }
}
