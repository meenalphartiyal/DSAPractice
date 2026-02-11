import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  private static void printResult(Set<List<Integer>> set){
    for (List<Integer> triplet : set) {
      for (int i : triplet) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
  // Time: O(N³) Space: O(1)
  private static Set<List<Integer>> brute(int[] arr) {
    int n = arr.length;
    Set<List<Integer>> result = new HashSet<>();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[j]);
            temp.add(arr[k]);
            Collections.sort(temp); // 3 log 3
            result.add(temp);
          }
        }
      }
    }
    return result;
  }

  // Time: O(N²) Space: O(N)
  private static Set<List<Integer>> better(int[] arr) {
    int n = arr.length;
    Set<List<Integer>> result = new HashSet<>();
    for (int i = 0; i < n; i++) {
      Set<Integer> set = new HashSet<>();
      for (int j = i + 1; j < n; j++) {
        int k = 0 - (arr[i] + arr[j]);
        if (set.contains(k)) {
          List<Integer> temp = Arrays.asList(arr[i], arr[j], k);
          Collections.sort(temp); // 3 log 3
          result.add(temp);
        }
        set.add(arr[j]);
      }
    }

    return result;
  }
// Time: O(N log N + N²) Space: O(1)
  private static Set<List<Integer>> optimal(int[] arr) {
    int n = arr.length;
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    for (int i = 0; i < n; i++) {
      int first = arr[i];
      int x = i+1, y = n-1;
      while(x < y){
        int second = arr[x];
        int third = arr[y];
        if(first + second + third == 0){
          List<Integer> temp = Arrays.asList(first, second, third);
          result.add(temp);
          x++;
          y--;
        } else if(first + second + third > 0){
          y--;
        } else {
          x++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
    // printResult(brute(arr));
    // printResult(better(arr));
    printResult(optimal(arr));
  }
}
