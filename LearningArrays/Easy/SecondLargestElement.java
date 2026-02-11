package LearningArrays.Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestElement{
    private static int solution(List<Integer> arr){
        int first = arr.get(0);
        int second = arr.get(0);
        for(int i : arr){
            if(i > first)
            {
                second = first;
                first = i;
            }
            if(i < first && i > second){
                second = i;
            }
        }
        return second;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(9, 15, 47, 47, 10, 2, 7));
        System.out.println(solution(arr));        
    }
}
