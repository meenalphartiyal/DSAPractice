package LearningArrays.Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates{
    private static List<Integer> bruteForce(List<Integer> arr){
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
    private static int optimalApproach(List<Integer> arr){
        int i = 0;
        for(int j=1; j<arr.size(); j++){
            if(arr.get(j) != arr.get(i)){
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5));
        List<Integer> res = bruteForce(arr);
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();

        int lastIdx = optimalApproach(arr);
        for(int i=0; i<lastIdx; i++){
            System.out.print(arr.get(i) + " ");
        } 
    }
}