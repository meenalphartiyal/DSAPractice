package Optimal;

public class Solution {
    private static int solution(int n){
        return (int)Math.log10(n) + 1;
    }
    public static void main(String[] args) {
        System.out.println("Number of digits are " + solution(1234));
    }
}

