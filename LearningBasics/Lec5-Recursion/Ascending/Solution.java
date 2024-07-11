public class Solution {
    private static void solution1(int n){
        if(n == 0)
            return;
        solution1(n-1);
        System.out.print(n + " ");
    }
    private static void solution2(int start, int end){
        if(start > end)
            return;
        System.out.print(start + " ");
        solution2(start + 1, end);
    }
    public static void main(String[] args) {
        System.out.println("Printing 1 to N");
        solution1(Integer.parseInt(args[1]));
        System.out.println();
        System.out.println("Printing i to N");
        solution2(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
