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
    private static void solution(List<Integer> arr, int i){
        if(i >= arr.size())
            return;
        int select = i;
        while(select>0 && arr.get(select) < arr.get(select-1)){
            int temp = arr.get(select);
            arr.set(select, arr.get(select-1));
            arr.set(select-1, temp);
            select--;
        }
        solution(arr, i+1);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        solution(arr, 0);
        printArray(arr);
    }
}
