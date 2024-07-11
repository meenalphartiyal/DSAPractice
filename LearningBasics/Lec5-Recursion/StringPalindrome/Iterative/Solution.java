public class Solution {
    private static boolean solution(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(n-1-i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solution(args[0]));
    }    
}
