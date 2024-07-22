import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution{
    private static List<Integer> solution(List<Integer> arr){
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i : arr){
            int key = i;
            int value = 0;
            if(freq.containsKey(key)){
                value = freq.get(key);
            }
            value++;
            freq.put(key, value);
        }
        for(Map.Entry<Integer, Integer> it : freq.entrySet()){
            res.add(it.getKey());
        }
        return res;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5));
        List<Integer> res = solution(arr);
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
    }
}