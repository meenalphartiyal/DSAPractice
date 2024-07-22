import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
    private static int solution(List<Integer> arr, int i, int max){
        if(i >= arr.size())
            return max;
        max = Math.max(arr.get(i), max);
        return solution(arr, i+1, max);
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(9, 15, 47, 10, 2, 7));
        System.out.println(solution(arr, 0, Integer.MIN_VALUE));        
    }
}