public class SetMatrixZero {
  private static void printMatrix(int[][] mat){
    for(int[] row : mat){
      for(int i : row){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
  // Time: O((RxC(R+C)) + (RxC)) Space: O(1)
  private static void mark(int[][] mat, int r, int c){
    int row = mat.length, col = mat[0].length;
    for(int i=0; i<row; i++){
      mat[i][c] = -1;
    }
    for(int i=0; i<col; i++){
      mat[r][i] = -1;
    }
  }
  private static int[][] bruteForce(int[][] mat){
    int r = mat.length, c = mat[0].length;
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        if(mat[i][j] == 0){
          mark(mat, i, j);
        }
      }
    }
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        if(mat[i][j] == -1){
          mat[i][j] = 0;
        }
      }
    }
    return mat;
  }
  // Time: O(2RxC) Space: O(R+C)
  private static int[][] betterAppraoch(int[][] mat){
    int r = mat.length, c = mat[0].length;
    int[] row = new int[r];
    int[] col = new int[c];
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        if(mat[i][j] == 0){
          row[i] = 1;
          col[j] = 1;
        }
      }
    }
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        if(row[i] == 1 || col[j] == 1){
          mat[i][j] = 0;
        }
      }
    }
    return mat;
  }
  // Time: O(RxC + R + C) Space: O(1)
  private static int[][] optimalApproach(int[][] mat){
    int col0 = mat[0][0] == 0 ? 0 : 1;
    int row = mat.length, col = mat[0].length; 
    for(int i=1; i<row; i++){
      for(int j=1; j<col; j++){
        if(mat[i][j] == 0){
          mat[0][j] = 0;
          mat[i][0] = 0;
        }
      }
    }

    for(int i=1; i<row; i++){
      for(int j=1; j<col; j++){
        if(mat[i][0] == 0 || mat[0][j] == 0){
          mat[i][j] = 0;
        }
      }
    }

    if(mat[0][0] == 0){
      for(int i=1; i<row; i++){
        mat[i][0] = 0;
      }
    }
    if(col0 == 0){
      for(int j=1; j<col; j++){
        mat[0][j] = 0;
      }
    }
    return mat;
  }
  public static void main(String[] args) {
    int[][] mat = new int[][]{
      {1, 1, 1},
      {1, 0, 1},
      {1, 1, 1}
    };
    // printMatrix(bruteForce(mat));
    // printMatrix(betterAppraoch(mat));
    printMatrix(optimalApproach(mat));
  }
}
