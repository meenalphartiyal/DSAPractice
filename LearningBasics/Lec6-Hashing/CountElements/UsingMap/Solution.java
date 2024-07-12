import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution{
    private static void solution(List<Integer> arr){
        Map<Integer, Integer> freq = new HashMap<>();
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
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4, 2));
        solution(arr);
    }
}