import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static void printArray(List<Integer>arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void solution(List<Integer> arr, int idx){
        if(idx >= arr.size()/2)
            return;
        int temp = arr.get(idx);
        arr.set(idx, arr.get(arr.size()-1-idx));
        arr.set(arr.size()-1-idx, temp);
        solution(arr, idx+1); 
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        solution(arr, 0);
        printArray(arr);
    }
}
