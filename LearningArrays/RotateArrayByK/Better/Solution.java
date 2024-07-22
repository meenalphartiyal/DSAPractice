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

    private static List<Integer> rotateLeft(List<Integer> arr, int k){
        List<Integer> res = new ArrayList<>();
        for(int i=k; i<arr.size(); i++){
            res.add(arr.get(i));
        }
        for(int i=0; i<k; i++){
            res.add(arr.get(i));
        }
        return res;
    }

    private static List<Integer> rotateRight(List<Integer> arr, int k){
        List<Integer> res = new ArrayList<>();
        int n = arr.size();
        for(int i=n-k; i<n; i++){
            res.add(arr.get(i));
        }
        for(int i=0; i<n-k; i++){
            res.add(arr.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> res1 = rotateLeft(arr, 3);
        printArray(res1);
        List<Integer> res2 = rotateRight(res1, 2);
        printArray(res2);
    }
}
