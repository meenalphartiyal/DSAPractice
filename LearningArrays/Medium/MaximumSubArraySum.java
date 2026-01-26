public class MaximumSubArraySum {
  // Time: O(N³) Space: O(1)
  private static void bruteForce(int[] arr){
    int start=0, end=0, n=arr.length, maxSum = Integer.MIN_VALUE;

    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        int sum = 0;
        for(int k=i; k<=j; k++){
          sum += arr[k];
        }
        if(sum > maxSum){
          maxSum = sum;
          start = i;
          end = j;
        }
      }
    }
    
    for(int i=start; i<=end; i++){
      System.out.print(arr[i] + " ");
    }

    System.out.println("\nMaximum Sum: " + maxSum);
  }
  // Time: O(N²) Space: O(1)
  private static void betterApproach(int[] arr){
    int start=0, end=0, n=arr.length, maxSum = Integer.MIN_VALUE;

    for(int i=0; i<n; i++){
      int sum = 0;
      for(int j=i; j<n; j++){
        sum += arr[j];
        if(sum > maxSum){
          maxSum = sum;
          start = i;
          end = j;
        }
      }
    }

    for(int i=start; i<=end; i++){
      System.out.print(arr[i] + " ");
    }

    System.out.println("\nMaximum Sum: " + maxSum);
  }
  // Time: O(N) Space: O(1)
  // Kadane's Algorithm
  private static void optimalApproach(int[] arr){
    int sum=0, maxSum=Integer.MIN_VALUE, start=0, end=0;
    for(int i=0; i<arr.length; i++){
      sum += arr[i];
      if(sum > maxSum){
        maxSum = sum;
        end = i;
      }
      if(sum < 0){
        sum = 0;
        start = i+1;
      }
    }
    for(int i=start; i<=end; i++){
      System.out.print(arr[i] + " ");
    }

    System.out.println("\nMaximum Sum: " + maxSum);
  }
  public static void main(String[] args) {
    int[] arr = new int[]{2, 3, 5, -2, 7, -4};
    bruteForce(arr);
    betterApproach(arr);
    optimalApproach(arr);
  }
}
