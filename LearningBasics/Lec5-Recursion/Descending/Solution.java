public class Solution {
    private static void solution1(int n){
        if(n == 0)
            return;
        System.out.print(n + " ");
        solution1(n-1);
    }
    private static void solution2(int start, int end){
        if(end < start)
            return;
        System.out.print(end + " ");
        solution2(start, end - 1);
    }
    public static void main(String[] args) {
        System.out.println("Printing N to 1");
        solution1(Integer.parseInt(args[1]));
        System.out.println();
        System.out.println("Printing N to i");
        solution2(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
