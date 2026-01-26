import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  // Time: O(N²) Space: O(1)
  private static int bruteForce(int[] arr){
    int max_count = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      int count = 0;
      for(int j=0; j<arr.length; j++){
        if(arr[j] == arr[i])
          count++;
      }
      max_count = Math.max(max_count, count);
      if(max_count > arr.length/2)
        return arr[i];
    }
    return -1;
  }
  // Time: O(2N) Space: O(N)
  private static int betterApproach(int[] arr){
    Map<Integer, Integer> freq = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      int key = arr[i];
      int value = freq.getOrDefault(key, 0);
      value++;
      freq.put(key, value);
    }
    for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
      if(entry.getValue() > arr.length/2){
        return entry.getKey();
      }
    }
    return -1;
  }
  // Time: O(2N) Space: O(1)
  // Moore's Voting Algorithm
  private static int optimalApproach(int[] arr){
    int element=-1, count=0;
    for(int i=0; i<arr.length; i++){
      if(count == 0){
        count = 1;
        element = arr[i];
      }
      else if(arr[i] == element)
        count++;
      else
        count--;
    }
    count=0;
    for(int i : arr){
      if(i == element)
        count++;
    }
    if(count > arr.length / 2)
      return element;
    return -1;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{7, 0, 0, 1, 7, 7, 2};
    System.out.println(bruteForce(arr));
    System.out.println(betterApproach(arr));
    System.out.println(optimalApproach(arr));
  }
}
