import java.util.ArrayList;
import java.util.List;

public class ArrayBySign {
  private static void printArray(int[] arr){
    for(int i : arr){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  // This appraoch will work for both the case
  // 1. UNEQUAL number of +ves and -ves 
  // 2. EQUAL number of +ves and -ves
  // Time: O(2N) Space: O(N)
  private static int[] solution(int[] arr){
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();

    for(int i : arr){
      if(i < 0)
        neg.add(i);
      else
        pos.add(i);
    }
    if(pos.size() > neg.size()){
      for(int i=0; i<neg.size(); i++){
        arr[2*i] = pos.get(i);
        arr[2*i+1] = neg.get(i);
      }
      int j = pos.size()+neg.size()-2;
      for(int i=neg.size(); i<pos.size(); i++){
        arr[j] = pos.get(i);
        j++;
      }
    } else {
      for(int i=0; i<pos.size(); i++){
        arr[2*i] = pos.get(i);
        arr[2*i+1] = neg.get(i);
      }
      int j = pos.size()+neg.size()-2;
      for(int i=pos.size(); i<neg.size(); i++){
        arr[j] = neg.get(i);
        j++;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,-4,-1,-2,-3};
    printArray(solution(arr));
  }
}
