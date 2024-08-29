import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static List<Integer> solution(List<Integer> arr1, List<Integer> arr2){
        List<Integer> res = new ArrayList<>();
        int i=0, j=0;
        while(i < arr1.size() && j < arr2.size()){
            int n = res.size();
            if(arr1.get(i) <= arr2.get(j)){
                if(n == 0 || res.get(n-1) != arr1.get(i))
                    res.add(arr1.get(i));
                i++;
            } else {
                if(n == 0 || res.get(n-1) != arr2.get(j))
                    res.add(arr2.get(j));
                j++;
            }
        }
        while(i < arr1.size()){
            if(res.get(res.size()-1) != arr1.get(i))
                res.add(arr1.get(i));
            i++;
        }
        while(j < arr2.size()){
            if(res.get(res.size()-1) != arr2.get(j))
                res.add(arr2.get(j));
            j++;
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
