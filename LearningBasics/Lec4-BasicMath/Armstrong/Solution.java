public class Solution {
    private static boolean solution(int n){
        int num = n;
        int res = 0;
        int digit = (int)Math.log10(n) + 1;
        while(n > 0){
            int rem = n % 10;
            res += (int)Math.pow(rem, digit);
            n /= 10;
        }
        return res == num;
    }
    public static void main(String[] args) {
        System.out.println(solution(Integer.parseInt(args[0])));
    }
}
