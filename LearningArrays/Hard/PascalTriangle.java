import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle {
//   Time: O(N²) Space: O(N²)
  private static void generatePascalTriangle(int n){
    List<List<Integer>> triangle = new ArrayList<>(n);
    triangle.add(new ArrayList<>(Arrays.asList(1)));
    
    for(int i=1; i<n; i++){
      List<Integer> row = new ArrayList<>();
      row.add(1);
      for(int j=1; j<i; j++){
        int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
        row.add(value);
      }
      row.add(1);
      triangle.add(row);
    }
    
    for(int i=0; i<n; i++){
      for(int j=0; j<=i; j++){
        System.out.print(triangle.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
  
// Time: O(N) Space: O(1)
  private static void printNthRow(int n){
    int result = 1;
    n--;
    System.out.print("1 ");
    for(int r=0; r<n; r++){
      result *= n-r;
      result /= r+1;
      System.out.print(result + " ");
    }
  }
  
// Time: O(col) Space: O(1)
  private static int printTerm(int row, int col){
    int n = row-1;
    int r = col-1;
    // nCr = n! / (n-r)! * r! = (n * n-1 * ... * n-r+1) / (r * r-1 * ... * 1)
    int result = 1;
    for(int i=0; i<r; i++){
      result *= n-i;
      result /= i+1;
    }
    return result;
  }
  
  public static void main(String[] args) {
    int n = 5;
    generatePascalTriangle(n);
    printNthRow(n);
    System.out.println(printTerm(5, 3));
  }
}