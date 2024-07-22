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

    private static void rotateLeft(List<Integer> arr, int k){
        while(k-- > 0){
            int temp = arr.get(0);
            for(int i=1; i<arr.size(); i++){
                arr.set(i-1, arr.get(i));
            }
            arr.set(arr.size()-1, temp);
        }
    }

    private static void rotateRight(List<Integer> arr, int k){
        int n = arr.size();
        while(k-- > 0){
            int temp = arr.get(n-1);
            for(int i=n-1; i>0; i--){
                arr.set(i, arr.get(i-1));
            }
            arr.set(0, temp);
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        rotateLeft(arr, 2);
        printArray(arr);
        rotateRight(arr, 2);
        printArray(arr);
    }
}
