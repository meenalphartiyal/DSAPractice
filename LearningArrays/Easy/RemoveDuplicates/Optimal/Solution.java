import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
    private static int solution(List<Integer> arr){
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
        int lastIdx = solution(arr);
        for(int i=0; i<lastIdx; i++){
            System.out.print(arr.get(i) + " ");
        }        
    }
}