import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9461 {

    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        dp = new long[101];

        for (int i = 0; i < 101; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        while (T-- > 0) {
            sb.append(padovan(Integer.parseInt(br.readLine()))).append("\n");
        }

        System.out.println(sb);

    }

    public static long padovan(int N) {
        if (dp[N] == -1) {
            dp[N] = padovan(N - 2) + padovan(N - 3);
        }

        return dp[N];
    }
}
