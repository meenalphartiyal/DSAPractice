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
        List<Integer> rev_arr = new ArrayList<>();
        for(int i = arr.size()-1; i>=0; i--){
            rev_arr.add(arr.get(i));
        }
        return rev_arr;

    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> res = solution(arr);
        printArray(res);
    }
}

