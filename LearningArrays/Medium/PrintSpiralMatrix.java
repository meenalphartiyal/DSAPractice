public class PrintSpiralMatrix {
  // Time: O(N²) Space: O(1)
  private static void solution(int[][] mat){
    int n = mat.length;
    int top = 0;
    int bottom = n-1;
    int left = 0; 
    int right = n-1;
    
    while(left <= right && top <= bottom){
      for(int i=left; i<=right; i++){
        System.out.print(mat[top][i] + " ");
      }
      top++;
      for(int i=top; i<=bottom; i++){
        System.out.print(mat[i][right] + " ");
      }
      right--;
      for(int i=right; i>=left; i--){
        System.out.print(mat[bottom][i] + " ");
      }
      bottom--;
      for(int i=bottom; i>=top; i--){
        System.out.print(mat[i][left] + " ");
      }
      left++;
    }
  }
  public static void main(String[] args) {
    int[][] mat = new int[][]{ 
      { 1,  2,  3,  4,  5},
      { 16, 17, 18, 19, 6},
      { 15, 24, 25, 20, 7},
      { 14, 23, 22, 21, 8},
      { 13, 12, 11, 10, 9}
    };
    solution(mat);
  }
}
