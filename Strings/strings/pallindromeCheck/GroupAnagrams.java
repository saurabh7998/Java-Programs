package strings.pallindromeCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public static void main(String[] args) {
    String[] strings = {"eat", "rea", "tea", "pot", "top", "hello", "are"};

    Map<String, List<String>> hm = groupAnagrams(strings);

    for(Map.Entry e : hm.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue().toString());
    }
  }

  public static Map groupAnagrams(String[] arr) {

    Map<String, List<String>> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      char[] chars = arr[i].toCharArray();
      Arrays.sort(chars);

      if (!map.containsKey(chars.toString())) {
        map.put(chars.toString(), new ArrayList<>());
      }

      map.get(chars.toString()).add(arr[i]);

    }

    return map;
  }
}
