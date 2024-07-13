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
    private static int calculatePivot(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while(i < j){
            while(i<high && arr.get(i) <= pivot)
                i++;
            while(j>low && arr.get(j) > pivot)
                j--;
            if(i<j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(j);
        arr.set(j, arr.get(low));
        arr.set(low, temp);
        return j;
    }
    private static void solution(List<Integer> arr, int low, int high){
        if(low < high){
            int pivotIdx = calculatePivot(arr, low, high);
            solution(arr, low, pivotIdx-1);
            solution(arr, pivotIdx+1, high);
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        int n = arr.size()-1;
        solution(arr, 0, n);
        printArray(arr);
    }
}
