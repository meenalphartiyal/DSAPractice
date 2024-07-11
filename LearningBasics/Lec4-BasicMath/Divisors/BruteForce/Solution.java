import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static void printArray(List<Integer>arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    private static List<Integer> solution(int n){
        List<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr = solution(Integer.parseInt(args[0]));
        printArray(arr);
    }    
}
