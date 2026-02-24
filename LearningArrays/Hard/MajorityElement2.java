import java.util.HashMap;
import java.util.Map;

public class MajorityElement2 {
  //  Time: O(N²) Space: O(1) 
    private static void bruteForce(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
      int count = 0;
      for(int j=i; j<n; j++){
        if(arr[i] == arr[j])
          count++;
      }
      if(count > n/3)
        System.out.print(arr[i] + " ");
    }
  }
  
  //  Time: O(2N) Space: O(N)
  private static void betterApproach(int[] arr){
    int n = arr.length;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
      int value = map.getOrDefault(arr[i], 0);
      value++;
      map.put(arr[i], value);
    }
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
      if(entry.getValue() > n/3){
        System.out.print(entry.getKey() + " ");
      }
    }
  }
  
  //  Time: O(2N) Space: O(1)
  private static void optimalApproach(int[] arr){
    int n = arr.length;
    int e1=0, e2=0, c1=0, c2=0;
    for(int i=0; i<n; i++){
      if(c1 == 0 && arr[i] != e2){
        e1 = arr[i];
        c1 = 1;
      } else if(c2 == 0 && arr[i] != e1){
        e2 = arr[i];
        c2 = 1;
      } else if(arr[i] == e1){
        c1++;
      } else if(arr[i] == e2){
        c2++;
      }
    }
    c1 = 0;
    c2 = 0;
    for(int i=0; i<n; i++){
      if(arr[i] == e1) c1++;
      else if(arr[i] == e2) c2++;
    }
    if(c1 > n/3)
      System.out.print(e1 + " ");
    if(c2 > n/3)
      System.out.print(e2 + " ");
  }
  
    public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 1, 1, 3, 2};
    bruteForce(arr);
    betterApproach(arr);
    optimalApproach(arr);
    }  
}
