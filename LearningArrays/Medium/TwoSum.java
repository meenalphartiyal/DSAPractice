import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  // Time: O(N²) Space: O(1)
  private static void bruteForce(int[] arr, int k){
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i] + arr[j] == k){
          System.out.println(arr[i] + ", " + arr[j]);
        }
      }
    }
  }
  // Time: O(2N) Space: O(N)
  private static void betterApproach(int[] arr, int k){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      int num = k - arr[i];
      if(!map.containsKey(num)){
        map.put(arr[i], i);
      } else {
        System.out.println(num + ", " + arr[i]);
      }
    }
  }
  // Time O(N log N) + O(N/2) ≈ O(N log N) Space: O(1)
  private static void optimalApproach(int[] arr, int k){
    Arrays.sort(arr);
    int i=0, j=arr.length-1;
    while(i < j){
      int sum = arr[i] + arr[j];
      if(sum == k){
        System.out.println(arr[i] + ", " + arr[j]);
        i++;
        j--;
      } else if(sum < k){
        i++;
      } else {
        j--;
      }
    }
  }
  public static void main(String[] args) {
    int[] nums = new int[]{2,6,3,8,11};
    int k = 14;
    bruteForce(nums, k);
    betterApproach(nums, k);
    optimalApproach(nums, k);
  }  
}
