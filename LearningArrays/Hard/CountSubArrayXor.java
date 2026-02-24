import java.util.HashSet;
import java.util.Set;

public class CountSubArrayXor {
  // Time: O(N²) Space: O(1) 
  private static int bruteForce(int[] arr, int b){
    int n = arr.length;
    int count = 0;
    for(int i=0; i<n; i++){
      int xor = 0;
      for(int j=i; j<n; j++){
        xor ^= arr[j];
        if(xor == b){
          count++;
        } 
      }
    }
    return count;
  }
  // Time: O(N) Space: O(N)
  private static int optimalAppraoch(int[] arr, int b){
    int n = arr.length;
    Set<Integer> set = new HashSet<>();
    int count = 0, xor=0;
    for(int i=0; i<n; i++){
      xor ^= arr[i];
      int value = xor ^ b;
      if(xor == b || set.contains(value)){
        count++;
      }
      set.add(xor);
    }
    return count;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{5, 6, 7, 8, 9};
    int b = 5;
    System.out.println(bruteForce(arr, b));
    System.out.println(optimalAppraoch(arr, b));
  }
}
