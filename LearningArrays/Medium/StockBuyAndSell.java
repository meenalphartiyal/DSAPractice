public class StockBuyAndSell {
  // Time: O(N²) Space: O(1)
  private static int bruteForce(int[] arr){
    int maxProfit = 0;
    for(int i=0; i<arr.length; i++){
      int max = arr[i];
      for(int j=i+1; j<arr.length; j++){
        max = arr[j] > max ? arr[j] : max;
      }
      int profit = max - arr[i];
      maxProfit = profit > maxProfit ? profit : maxProfit;
    }
    return maxProfit;
  }
  // Time: O(2N) Space: O(1)
  private static int optimalApproach(int[] arr){
    int min=Integer.MAX_VALUE, maxProfit=0;
    for(int i=0; i<arr.length; i++){
      min = arr[i] < min ? arr[i] : min;
      int profit = arr[i] - min;
      maxProfit = profit > maxProfit ? profit : maxProfit;
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int[] arr = new int[]{7,1,5,3,6,4};
    System.out.println(bruteForce(arr));
    System.out.println(optimalApproach(arr));
  }
}
