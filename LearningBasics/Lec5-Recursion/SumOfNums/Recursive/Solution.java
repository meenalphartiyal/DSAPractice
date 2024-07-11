public class Solution {
    private static int solution1(int n, int sum){
        if(n == 0)
            return sum;
        return solution1(n - 1, sum + n);
    }
    private static int solution2(int n){
        if(n == 1)
            return 1;
        return n + solution2(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(solution1(Integer.parseInt(args[0]), 0));
        System.out.println(solution2(Integer.parseInt(args[0])));
    }    
}
