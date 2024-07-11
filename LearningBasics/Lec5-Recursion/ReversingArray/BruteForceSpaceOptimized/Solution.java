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

    private static List<Integer> solution(List<Integer> arr){
        int n = arr.size();
        for(int i=0; i<n/2; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(n-1-i));
            arr.set(n-1-i, temp);
        }
        return arr;

    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> res = solution(arr);
        printArray(res);
    }
}
