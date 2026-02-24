import java.util.HashMap;
import java.util.Map;

class LargestSubArraySum0 {
  // Time: O(N²) Space: O(1)
  private static int bruteForce(int[] arr){
    int n = arr.length;
    int maxLength = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      int sum = 0;
      for(int j=i; j<n; j++){
        sum += arr[j];
        if(sum == 0){
          int length = j - i + 1;
          maxLength = Math.max(maxLength, length);
        } 
      }
    }
    return maxLength;
  }
  // Time: O(1) Space: O(N)
  private static int optimalApproach(int[] arr){
    int n = arr.length;
    Map<Integer, Integer> map = new HashMap<>();
    int maxLength = Integer.MIN_VALUE;
    int sum = 0;
    for(int i=0; i<n; i++){
      sum += arr[i];
      if(sum == 0){
        maxLength = Math.max(maxLength, i+1);
      }
      if(map.containsKey(sum)){
        int length = i - map.get(sum) + 1;
        maxLength = Math.max(maxLength, length);
      }
      map.put(sum, i);
    }
    return maxLength;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{6, -2, 2, -8, 1, 7, 4, -10};
    System.out.println(bruteForce(arr));
    System.out.println(optimalApproach(arr));
  }
}