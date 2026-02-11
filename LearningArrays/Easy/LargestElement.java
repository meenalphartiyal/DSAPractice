package LearningArrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestElement{
    private static int bruteForce(List<Integer> arr){
        int res = Integer.MIN_VALUE;
        for(int i : arr){
            res = Math.max(res, i);
        }
        return res;
    }
    private static int recursion(List<Integer> arr, int i, int max){
        if(i >= arr.size())
            return max;
        max = Math.max(arr.get(i), max);
        return recursion(arr, i+1, max);
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(9, 15, 47, 10, 2, 7));
        System.out.println(bruteForce(arr));
        System.out.println(recursion(arr, 0, Integer.MIN_VALUE));      
    }
}