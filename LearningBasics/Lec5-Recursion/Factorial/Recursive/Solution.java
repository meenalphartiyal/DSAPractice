public class Solution {
    private static int solution(int n){
        if(n == 0)
            return 1;
        return n * solution(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial is " + solution(Integer.parseInt(args[0])));
    }
}
