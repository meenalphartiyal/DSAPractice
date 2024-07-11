public class Solution {
    private static int solution(int n){
        int fact = 1;
        for(int i=2; i<=n; i++)
            fact *= i;

        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Factorial is " + solution(Integer.parseInt(args[1])));
    }
}
