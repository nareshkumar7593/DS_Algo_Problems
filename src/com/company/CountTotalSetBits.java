package com.company;

import java.util.Scanner;

public class CountTotalSetBits {
  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    System.out.println("Enter the Input:");
    int inputValue = inputReader.nextInt();
    int count = 0;
    for(int i = 1; i<=inputValue; i++){
      int n = 0;
      while(n != i){
        if(0 != (i & 1 << n)){
          count ++;
          n++;
        }
        else
          n++;
      }
    }
    System.out.println("The total count of set bits from 0 is : " +count);
  }
}
