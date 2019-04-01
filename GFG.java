package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;
// Bit Manipulation
// finding the least significant bit - For input 1 or above
class GFG
{
  public static void main (String[] args)
  {
    System.out.println("Enter the number of testcases");
    Scanner inputReader = new Scanner(System.in);
    int count = inputReader.nextInt();
    System.out.println("Hey" +count);
    int a = 0;
    while(count >= 1){
      int inputNumber = inputReader.nextInt();
      int i = 0;
      while(a == (inputNumber & 1 << i))
        i++;
      System.out.println(i + 1);
      count--;
    }
  }
}
