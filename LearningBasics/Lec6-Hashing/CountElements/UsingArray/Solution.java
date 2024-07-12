import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
    private static void solution(List<Integer> arr){
        int size = Integer.MIN_VALUE;
        for(int i : arr){
            size = Math.max(size, i); 
        }
        int[] freq = new int[size+1];
        for(int i : arr){
            freq[i]++;
        }
        for(int i=0; i<size+1; i++){
            if(freq[i] != 0){
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4, 2));
        solution(arr);
    }
}