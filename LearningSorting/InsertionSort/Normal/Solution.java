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
            int select = i;
            while(select>0 && arr.get(select) < arr.get(select-1)){
                int temp = arr.get(select);
                arr.set(select, arr.get(select-1));
                arr.set(select-1, temp);
                select--;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        solution(arr);
        printArray(arr);
    }
}
