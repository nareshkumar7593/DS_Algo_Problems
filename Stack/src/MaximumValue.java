//You have an empty sequence, and you will be given  queries. Each query is one of these three types:
//
//1 x  -Push the element x into the stack.
//2    -Delete the element present at the top of the stack.
//3    -Print the maximum element in the stack.
//Input Format
//
//The first line of input contains an integer, . The next  lines each contain an above mentioned query. (It is guaranteed that each query is valid.)
//
//Constraints
//
//
//
//Output Format
//
//For each type  query, print the maximum element in the stack on a new line.
//
//Sample Input
//
//10
//1 97
//2
//1 20
//2
//1 26
//1 20
//2
//3
//1 91
//3
//Sample Output
//
//26
//91


import java.io.*;
import java.util.*;

public class MaximumValue {

  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    long n = inputReader.nextInt();
    Stack<Long> operations = new Stack<>();
    for(long i = 0; i<n; i++){
      long option = inputReader.nextInt();
      if(option == 1){
        long push = inputReader.nextInt();
        operations.push(push);
      }
      else if(option == 2){
        operations.pop();
      }
      else if(option == 3){
        long max = Long.MIN_VALUE;
        for(int j = 0;j<operations.size();j++){
          if(max < operations.get(j))
            max = operations.get(j);
        }
        System.out.println(max);
      }
    }
  }
}

