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
    private static void solution(List<Integer> arr){
        int n=arr.size();
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                minIdx = (arr.get(j) < arr.get(minIdx)) ? j : minIdx;
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        solution(arr);
        printArray(arr);
    }
}
