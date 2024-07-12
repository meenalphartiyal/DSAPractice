public class Solution{
    private static void solution(String str){
        int[] freq = new int[256];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0; i<256; i++){
            if(freq[i] != 0){
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        solution(args[0]);
    }
}