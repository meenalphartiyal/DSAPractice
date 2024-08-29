import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private static List<Integer> solution(List<Integer> arr1, List<Integer> arr2){
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        for(int i : set){
            res.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(2,3,4,4,5));
        List<Integer> union = solution(arr1, arr2);
        for(int i: union){
            System.out.print(i + " ");
        }
    }    
}
