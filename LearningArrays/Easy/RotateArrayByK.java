package LearningArrays.Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayByK {
    private static void printArray(List<Integer> arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void rotateLeftBrute(List<Integer> arr, int k){
        while(k-- > 0){
            int temp = arr.get(0);
            for(int i=1; i<arr.size(); i++){
                arr.set(i-1, arr.get(i));
            }
            arr.set(arr.size()-1, temp);
        }
    }

    private static void rotateRightBrute(List<Integer> arr, int k){
        int n = arr.size();
        while(k-- > 0){
            int temp = arr.get(n-1);
            for(int i=n-1; i>0; i--){
                arr.set(i, arr.get(i-1));
            }
            arr.set(0, temp);
        }
    }

    private static List<Integer> rotateLeftBetter(List<Integer> arr, int k){
        List<Integer> res = new ArrayList<>();
        for(int i=k; i<arr.size(); i++){
            res.add(arr.get(i));
        }
        for(int i=0; i<k; i++){
            res.add(arr.get(i));
        }
        return res;
    }

    private static List<Integer> rotateRightBetter(List<Integer> arr, int k){
        List<Integer> res = new ArrayList<>();
        int n = arr.size();
        for(int i=n-k; i<n; i++){
            res.add(arr.get(i));
        }
        for(int i=0; i<n-k; i++){
            res.add(arr.get(i));
        }
        return res;
    }

    private static void reverseArray(List<Integer> arr, int low, int high){
        while(low < high){
            int temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;
        }
    }

    private static void rotateLeftOptimal(List<Integer> arr, int k){
        int n = arr.size();
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
    }

    private static void rotateRightOptimal(List<Integer> arr, int k){
        int n = arr.size();
        reverseArray(arr, 0, n-1-k);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        rotateLeftBrute(arr, 2);
        printArray(arr);
        rotateRightBrute(arr, 2);
        printArray(arr);

        List<Integer> res1 = rotateLeftBetter(arr, 3);
        printArray(res1);
        List<Integer> res2 = rotateRightBetter(res1, 2);
        printArray(res2);

        rotateLeftOptimal(arr, 3);
        printArray(arr);
        rotateRightOptimal(arr, 2);
        printArray(arr);
    }
}
