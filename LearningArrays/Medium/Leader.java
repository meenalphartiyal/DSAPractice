import java.util.ArrayList;
import java.util.List;

public class Leader {
  private static void printArray(List<Integer> arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  // Time: O(N²) Space: O(1)
  private static List<Integer> bruteForce(int[] arr) {
    List<Integer> leaders = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
      boolean flag = true;
      for(int j=i+1; j<arr.length; j++){
        if(arr[i] < arr[j]){
          flag = false;
        }
      }
      if(flag){
        leaders.add(arr[i]);
      }
    }
    return leaders;
  }
  // Time: O(N) Space: O(1)
  private static List<Integer> optimalApproach(int[] arr) {
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    List<Integer> leaders = new ArrayList<>();
    for(int i=n-1; i>=0; i--){
      if(arr[i] > max){
        max = arr[i];
        leaders.add(max);
      }
    }
    return leaders;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{10, 22, 12, 3, 0, 6};
    printArray(bruteForce(arr));
    printArray(optimalApproach(arr));
  }
}
