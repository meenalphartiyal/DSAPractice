import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static void printArray(List<Integer> arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void reverseArray(List<Integer> arr, int low, int high){
        while(low < high){
            int temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;
        }
    }

    private static void rotateLeft(List<Integer> arr, int k){
        int n = arr.size();
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
    }

    private static void rotateRight(List<Integer> arr, int k){
        int n = arr.size();
        reverseArray(arr, 0, n-1-k);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        rotateLeft(arr, 3);
        printArray(arr);
        rotateRight(arr, 2);
        printArray(arr);
    }
}
