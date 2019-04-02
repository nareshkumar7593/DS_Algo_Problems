package com.company;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.log;

public class BitDifference {
  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    System.out.println("Enter the First and Second Number:");
    int firstNum = inputReader.nextInt();
    int secondNum = inputReader.nextInt();

    int difference = firstNum ^ secondNum;
    System.out.println(difference);
    int count = 0, i = 0;
    while(i <= Math.log(difference)/Math.log(2)) {
      if (0 != (difference & 1 << i)) {
        count++;
        i++;
      } else
        i++;
    }
    System.out.println("The Bit Difference Value is : "+count);
  }
}
