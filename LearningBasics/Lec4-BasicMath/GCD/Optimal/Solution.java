public class Solution {
    private static int gcd(int n1, int n2){
        if(n1 == 1 || n2 == 1)
            return 1;
        if(n1 % n2 == 0 || n2 % n1 == 0)
            return Math.min(n1, n2);
        return gcd(Math.min(n1, n2), Math.abs(n1-n2));
    } 
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println(gcd(n1, n2));
    }
}
