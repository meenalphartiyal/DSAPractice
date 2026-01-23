import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayOfThree {
  private static void printArray(int[] arr){
    for(int i : arr){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  private static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
  // Time: O(N log N) Space: O(1)
  private static int[] bruteForce(int[] arr){
    Arrays.sort(arr);
    return arr;
  }
  // Time: O(2N) Space: O(N)
  private static int[] betterApproach(int[] arr){
    int c0=0, c1=0, c2=0;
    int[] res = new int[arr.length];
    for(int i : arr){
      if(i == 0) c0++;
      else if(i == 1) c1++;
      else c2++;
    }

    for(int i=0; i<c0; i++){
      res[i] = 0;
    }
    for(int i=c0; i<c0+c1; i++){
      res[i] = 1;
    }
    for(int i=c0+c1; i<c0+c1+c2; i++){
      res[i] = 2;
    }
    return res;
  }
  // Time: O(N) Space: O(1)
  private static int[] optimalApproach(int[] arr){
    int low=0, mid=0, high=arr.length-1;
    while(mid < high){
      if(arr[mid] == 0){
        swap(arr, mid, low);
        low++;
        mid++;
      } else if(arr[mid] == 1){
        mid++;
      } else {
        swap(arr, mid, high);
        high--;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{1, 0, 2, 1, 0};
    printArray(bruteForce(arr));
    printArray(betterApproach(arr));
    printArray(optimalApproach(arr));
  }  
}
