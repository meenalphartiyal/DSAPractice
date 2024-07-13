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
    private static void solution(List<Integer> arr, int n){
        if(n < 0)
            return;
        for(int j=0; j<n; j++){
            if(arr.get(j+1) < arr.get(j)){
                int temp = arr.get(j+1);
                arr.set(j+1, arr.get(j));
                arr.set(j, temp);
            }
        }
        solution(arr, n-1);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        solution(arr, arr.size()-1);
        printArray(arr);
    }
}
