package com.company;

import java.util.ArrayList;
import java.util.List;

public class Distinct {

  public static void main(String[] args) {
    List<List<Integer>> newlists = new ArrayList<>();
    int[] arr = {1,2,3};
    newlists = subsets(arr);

    System.out.println(newlists);
  }

  static List<List<Integer>> lists = new ArrayList<>();
  public static List<List<Integer>> subsets(int[] nums) {
    lists.add(new ArrayList<>());
    for(int i=0;i<nums.length;i++){
      recur(nums[i]);
    }
    return lists;
  }

  public static void recur(int num){
    int size = lists.size();
    for(int i=0;i<size;i++){
      List<Integer> list = new ArrayList<>(lists.get(i));
      list.add(num);
      lists.add(list);
    }
  }
}
