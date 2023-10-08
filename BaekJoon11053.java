import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon11053 {
    static Integer[] dp;
    static int[] seq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        seq = new int[N];
        dp = new Integer[N];

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(dp));

        for (int i = 0; i < N; i++) {
            lis(i);
        }

        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(seq));

        int max = dp[0];

        for (int i = 1; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }

    public static int lis(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N-1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], lis(i) + 1);
                }
            }
        }

        return dp[N];
    }
}


// lis(0)    dp[0] = 1;
// lis(1)    dp[1] = 1;    seq[0] < seq[1]    dp[1] = Math.max(dp[1], lis(0) +1)
// dp[1] = 2