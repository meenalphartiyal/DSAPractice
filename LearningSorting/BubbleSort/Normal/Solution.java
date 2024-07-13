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
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr.get(j+1) < arr.get(j)){
                    int temp = arr.get(j+1);
                    arr.set(j+1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        solution(arr);
        printArray(arr);
    }
}
