public class Solution {
    private static String solution(int n){
        int num = n;
        int rev=0;
        while(n>0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return (rev == num) ? "Palindrome" : "Not a Palindrome";
    }
    public static void main(String[] args) {
        System.out.println(solution(Integer.parseInt(args[0])));
    }
}
