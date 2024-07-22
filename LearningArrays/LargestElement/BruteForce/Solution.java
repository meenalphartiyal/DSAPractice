
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
    private static int solution(List<Integer> arr){
        int res = Integer.MIN_VALUE;
        for(int i : arr){
            res = Math.max(res, i);
        }
        return res;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(9, 15, 47, 10, 2, 7));
        System.out.println(solution(arr));        
    }
}