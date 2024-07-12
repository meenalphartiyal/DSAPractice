import java.util.HashMap;
import java.util.Map;

public class Solution{
    private static void solution(String str){
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char key = str.charAt(i);
            int value = 0;
            if(freq.containsKey(key)){
                value = freq.get(key);
            }
            value++;
            freq.put(key, value);
        }
        for(Map.Entry<Character, Integer> it : freq.entrySet()){
            System.out.println(it.getKey() + " -> " + it.getValue());
        }
    }
    public static void main(String[] args) {
        solution(args[0]);
    }
}