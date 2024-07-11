public class Solution {
    private static int gcd(int n1, int n2){
        int num = (n1 < n2) ? n1 : n2;
        int result = 1;
        for(int i=num; i>=2; i--){
            if(n1 % i == 0 && n2 % i == 0){
                result = i;
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println(gcd(n1, n2));
    }
}
