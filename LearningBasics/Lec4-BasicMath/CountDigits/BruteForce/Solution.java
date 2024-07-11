package BruteForce;

public class Solution {
    private static int solution(int n){
        int count=0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Number of digits in 1234 are " + solution(1234));
    }
}
