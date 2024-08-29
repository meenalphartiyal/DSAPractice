import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
    private static boolean solution(List<Integer> arr){
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i+1) < arr.get(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solution(arr));        
    }
}