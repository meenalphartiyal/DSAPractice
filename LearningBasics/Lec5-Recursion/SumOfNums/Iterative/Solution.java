public class Solution {
    private static int solution(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(solution(Integer.parseInt(args[0])));
    }    
}
