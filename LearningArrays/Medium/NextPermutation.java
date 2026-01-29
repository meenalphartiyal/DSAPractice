import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
  private static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Time: O(N² N! log N) Space: O(N N!)
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  private static void recursion(int[] arr, int index, List<int[]> list) {
    if (index == arr.length) {
      list.add(arr.clone());
      return;
    }
    for (int i = index; i < arr.length; i++) {
      swap(arr, i, index);
      recursion(arr, index + 1, list);
      swap(arr, i, index);
    }
  }

  private static int[] bruteForce(int[] arr) {
    List<int[]> list = new ArrayList<>();
    recursion(arr, 0, list);

    Collections.sort(list, (a, b) -> {
      for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i])
          return a[i] - b[i];
      }
      return 0;
    });

    for (int i = 0; i < list.size(); i++) {
      if (Arrays.equals(list.get(i), arr)) {
        if (i == list.size() - 1) {
          return list.get(0);
        } else {
          return list.get(i + 1);
        }
      }
    }
    return new int[] {};
  }
  // Time: O(N) Space: O(1) 
  private static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }
  private static int[] optimalApproach(int[] arr) {
    int n = arr.length;
    int breakpoint = n - 1;
    for (int i = n - 1; i > 0; i--) {
      if (arr[i - 1] < arr[i]) {
        breakpoint = i - 1;
        break;
      }
    }
    if (breakpoint == n - 1) {
      reverse(arr, 0, n - 1);
      return arr;
    }
    int min = Integer.MAX_VALUE;
    int minIdx = -1;
    for (int i = breakpoint + 1; i < n; i++) {
      if (arr[i] < min && arr[i] > arr[breakpoint]) {
        min = arr[i];
        minIdx = i;
      }
    }
    swap(arr, minIdx, breakpoint);
    reverse(arr, breakpoint + 1, n - 1);
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 2, 1 };
    printArray(bruteForce(arr.clone()));
    printArray(optimalApproach(arr.clone()));
  }
}
