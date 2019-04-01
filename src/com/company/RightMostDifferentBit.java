package com.company;

import java.util.Scanner;

public class RightMostDifferentBit {

  public static void main(String[] args) {
   Scanner inputReader = new Scanner(System.in);
   int i = 1;
   int exorValue = inputReader.nextInt() ^ inputReader.nextInt();
   while(0 == (exorValue & 1 << i))
     i++;
   System.out.println(i+1);

  }
}
