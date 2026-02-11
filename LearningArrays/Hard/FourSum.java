import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
  private static void printResult(Set<List<Integer>> set){
    for(List<Integer> quad : set){
      for(int i : quad){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
// Time: O(N^4) Space: O(1)
  private static Set<List<Integer>> brute(int[] arr, int target){
    int n = arr.length;
    Set<List<Integer>> result = new HashSet<>();

    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        for(int k=j+1; k<n; k++){
          for(int l=k+1; l<n; l++){
            int value = arr[i] + arr[j] + arr[k] + arr[l];
            if(value == target){
              List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
              Collections.sort(temp);
              result.add(temp);
            }
          }
        }
      }
    }
    return result;
  }
  // Time: O(N³) Space: O(N)
  private static Set<List<Integer>> better(int[] arr, int target){
    int n = arr.length;
    Set<List<Integer>> result = new HashSet<>();

    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        Set<Integer> set = new HashSet<>();
        for(int k=j+1; k<n; k++){
          int l = target - (arr[i] + arr[j] + arr[k]);
          if(set.contains(l)){
            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], l);
            Collections.sort(temp);
            result.add(temp);
          }
          set.add(arr[k]);
        }
      }
    }
    return result;
  }
  // Time: O(N log N + N³) Space: O(1)
  private static Set<List<Integer>> optimal(int[] arr, int target){
    int n = arr.length;
    Set<List<Integer>> result = new HashSet<>();
    Arrays.sort(arr);
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        int k = j+1, l = n-1;
        while(k < l){
          int value = arr[i] + arr[j] + arr[k] + arr[l];
          if(value == target){
            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
            result.add(temp);
            k++;
            l--;
          } else if(value > target){
            l--;
          } else {
            k++;
          }
        }
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{4,3,3,4,4,2,1,2,1,1};
    int target = 9;
    printResult(brute(arr, target));
    printResult(better(arr, target));
    printResult(optimal(arr, target));
  }
}
