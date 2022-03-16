package graph.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Covid {

  static List<Integer> array;

  public static void main(String[] args) {

    Integer[] arr = {1, 1, 2, 2, 1, 1, 3};
    array = new ArrayList<>();

    ArrayList temp = new ArrayList();
    for(int i : arr){
      array.add(i);
    }

    Collections.addAll(temp, arr);

    int target = function(array, Integer.MAX_VALUE);
    System.out.println(target);
     boolean res = frequency(temp, target);
    System.out.println(array.size());
    System.out.println(res);
  }

  private static int function(List<Integer> arr, int dummy) {

    if (arr.size() == 0) {
      return dummy;
    }

    if (arr.size() == 1) {
      return arr.get(0);
    }

    int last = 0;
    if (arr.size() % 2 != 0) {
      last = arr.get(arr.size() - 1);
      arr.remove(arr.size() - 1);
    }

    List<Integer> arrList = new ArrayList<>();
    for (int i = 0; i < arr.size(); i += 2) {
      if (i + 1 < arr.size()) {
        if (arr.get(i) == arr.get(i + 1)) {
          arrList.add(arr.get(i));
        }
      } else {
        arrList.add(arr.get(i));
      }
    }

    return function(arrList, last);
  }

  private static boolean frequency(List<Integer> temp, int target) {
    int count = 0;
    for (int i = 0; i < temp.size(); i++) {
      if (temp.get(i) == target) {
        count++;
      }
    }
    return count > (temp.size()/2) ? true : false;
  }


}


