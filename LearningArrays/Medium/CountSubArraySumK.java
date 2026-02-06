import java.util.HashMap;
import java.util.Map;

public class CountSubArraySumK {
  // Time: O(N³) Space: O(1)
  private static int bruteForce(int[] arr, int k){
    int count=0, n=arr.length;

    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        int sum = 0;
        for(int l=i; l<=j; l++){
          sum += arr[l];
        }
        if(sum == k){
          count++;
        }
      }
    }
    return count;
  }
  // Time: O(N²) Space: O(1)
  private static int betterApproach(int[] arr, int k){
    int count=0, n=arr.length;

    for(int i=0; i<n; i++){
      int sum = 0;
      for(int j=i; j<n; j++){
        sum += arr[j];
        if(sum == k){
          count++;
        }
      }
    }
    return count;
  }
  // Time: O(N) Space: O(N)
  private static int optimalApproach(int[] arr, int k){
    int count=0, n=arr.length;
    int sum=0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for(int i=0; i<n; i++){
      sum += arr[i];
      if(map.containsKey(sum - k)){
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3};
    int k = 3;
    System.out.println(bruteForce(arr, k));
    System.out.println(betterApproach(arr, k));
    System.out.println(optimalApproach(arr, k));
  }
} 
