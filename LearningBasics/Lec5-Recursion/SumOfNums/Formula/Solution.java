public class Solution {
    private static int solution(int n){
        return n* (n+1) / 2;
    }
    public static void main(String[] args) {
        System.out.println(solution(Integer.parseInt(args[0])));
    }    
}
