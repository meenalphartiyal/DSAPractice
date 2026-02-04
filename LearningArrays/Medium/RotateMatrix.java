public class RotateMatrix {
  private static void printMatrix(int[][] mat){
    for(int[] row : mat){
      for(int i : row){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
  private static void reverse(int[] arr){
    int i=0, j=arr.length-1;
    while(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
  // Time: O(2xRxC) Space: O(CxR)
  private static int[][] bruteForce(int[][] mat){
    int n = mat.length;
    int[][] result = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        result[j][i] = mat[i][j];
      }
    }
    for(int i=0; i<n; i++){
      reverse(result[i]);
    }
    return result;
  }
  // Time: O(RxC) Space: O(1)
  private static int[][] optimalApproach(int[][] mat){
    int n = mat.length;
    for(int i=0; i<n; i++){
      for(int j=0; j<=i; j++){
        int temp = mat[j][i];
        mat[j][i] = mat[i][j];
        mat[i][j] = temp;
      }
    }
    for(int i=0; i<n; i++){
      reverse(mat[i]);
    }
    return mat;
  }

  public static void main(String[] args) {
    int[][] mat = new int[][]{
      {0,1,2,0},
      {3,4,5,2},
      {1,3,1,5},
      {1,2,3,4}
    };
    printMatrix(bruteForce(mat));
    printMatrix(optimalApproach(mat));
  }
}
