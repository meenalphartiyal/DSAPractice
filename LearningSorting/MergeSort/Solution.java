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
    private static void merge(List<Integer> arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(arr.get(left) < arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else{
                temp.add(arr.get(right));
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr.get(left));
            left++;
        }
        while(right <= high){
            temp.add(arr.get(right));
            right++;
        }
        for(int i=low; i<=high; i++){
            arr.set(i, temp.get(i-low));
        }
    }
    private static void solution(List<Integer> arr, int low, int high){
        if(low >= high)
            return;
        int mid = low + (high - low) / 2;
        solution(arr, low, mid);
        solution(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 9, 3, 4, 8));
        int n = arr.size()-1;
        solution(arr, 0, n);
        printArray(arr);
    }
}
