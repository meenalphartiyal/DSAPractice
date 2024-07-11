public class Solution {
    private static boolean solution(String str, int idx){
        int n = str.length();
        if(idx >= n/2)
            return true;
        if(str.toLowerCase().charAt(idx) != str.toLowerCase().charAt(n-1-idx))
            return false;
        return solution(str, idx+1);
    }
    public static void main(String[] args) {
        System.out.println(solution(args[0], 0));
    }    
}
