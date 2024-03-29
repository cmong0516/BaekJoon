import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2156 {

    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        arr = new int[N + 1];

        for (int i = 1; i < N+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = arr[1];

        if (N > 1) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(solve(N));


    }

    public static int solve(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(Math.max(solve(N - 2), solve(N - 3) + arr[N - 1]) + arr[N], solve(N - 1));
        }

        return dp[N];
    }
}
