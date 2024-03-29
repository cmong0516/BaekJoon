import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon12865 {

    static int N, K;
    static Integer[][] dp;
    static int[] W;
    static int[] V;

    public static void main(String[] args) throws IOException {
        // 필요한 물건 N 개

        // 물건은 무게 W 와 가치 V

        // 준서의 최대 무게 K

        // 1 0
        // 2 0
        // 3 6
        // 4  7 , 8
        // 5 12
        // 6 13
        // 7 14

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        W = new int[N];
        V = new int[N];

        dp = new Integer[N][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(N - 1, K));

    }

    public static int knapsack(int i, int k) {
        if (i < 0) {
            return 0;
        }

        if (dp[i][k] == null) {
            if (W[i] > k) {
                dp[i][k] = knapsack(i - 1, k);
            } else {
                dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]);
            }
        }

        return dp[i][k];
    }
}
