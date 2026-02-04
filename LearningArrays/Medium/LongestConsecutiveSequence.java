import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
  // Time: O(N²) Space: O(1)
  private static boolean linearSearch(int[] arr, int num){
    for(int i=0; i<arr.length; i++){
      if(arr[i] == num)
        return true;
    }
    return false;
  }
  private static int bruteForce(int[] arr){
    int n = arr.length, maxLen = 1;
    for(int i=0; i<n; i++){
      int num = arr[i];
      int length = 1;
      while(linearSearch(arr, num + 1)){
        length++;
        num += 1;
      }
      maxLen = Math.max(maxLen, length);
    }
    return maxLen;
  }
  // Time: O(N log N) Space: O(1)
  private static int betterAppraoch(int[] arr){
    int n = arr.length, maxLen = 1, length = 1;
    Arrays.sort(arr);
    for(int i=0; i<n-1; i++){
      if(arr[i+1] == arr[i] + 1){
        length++;
      } else {
        length = 1;
      }  
      maxLen = Math.max(maxLen, length);
    }
    return maxLen;
  }
  // Time: O(3N) Space: O(N)
  private static int optimalAppraoch(int[] arr){
    Set<Integer> set = new HashSet<>();
    for(int i : arr){
      set.add(i);
    }
    int maxLen = 1;
    for(int i : set){
      if(!set.contains(i-1)){
        int length = 1;
        while(set.contains(i + 1)){
          length++;
          i += 1;
        }
        maxLen = Math.max(maxLen, length);
      }
    }
    return maxLen;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{100, 101, 200, 1, 3};
    System.out.println(bruteForce(arr));
    System.out.println(betterAppraoch(arr));
    System.out.println(optimalAppraoch(arr));
  }
}
