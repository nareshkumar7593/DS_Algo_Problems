package com.company;

import java.util.Scanner;

public class CheckKthBit {
  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int inputValue = inputReader.nextInt();
    System.out.println("Enter the Bit to be checked:");
    int kbit = inputReader.nextInt();
    if (0 != (inputValue & (1 << kbit + 1)))
      System.out.println("yes");
    else
      System.out.println("No");


  }
}

