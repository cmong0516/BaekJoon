import java.util.Scanner;

public class BaekJoon1149 {

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        cost = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            cost[i][0] = sc.nextInt();
            cost[i][1] = sc.nextInt();
            cost[i][2] = sc.nextInt();
        }

        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.println(Math.min(paint(n - 1, 0), Math.min(paint(n - 1, 1), paint(n - 1, 2))));

    }

    public static int paint(int n, int color) {
        if (dp[n][color] == 0) {
            if (color == 0) {
                dp[n][0] = Math.min(paint(n - 1, 1), paint(n - 1, 2)) + cost[n][0];
            } else if (color == 1) {
                dp[n][1] = Math.min(paint(n - 1, 0), paint(n - 1, 2)) + cost[n][1];
            } else {
                dp[n][2] = Math.min(paint(n - 1, 0), paint(n - 1, 1)) + cost[n][2];
            }
        }
        return dp[n][color];
    }
}
