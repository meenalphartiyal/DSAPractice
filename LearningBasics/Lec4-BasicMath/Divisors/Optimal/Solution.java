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
        arr.add(1);
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                arr.add(i);
                if(i != n/i)
                    arr.add(n/i);
            }
        }
        arr.add(n);
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr = solution(Integer.parseInt(args[0]));
        printArray(arr);
    }    
}