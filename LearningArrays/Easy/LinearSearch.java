package LearningArrays.Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch{
    public static int solution(List<Integer> arr, int target){
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,9,52,76,32,5,7));
        System.out.println(solution(arr, 52));
    }

}